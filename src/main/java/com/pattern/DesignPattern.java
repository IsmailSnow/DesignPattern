package com.pattern;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pattern.chainResponsability.AddNumbers;
import com.pattern.chainResponsability.Chain;
import com.pattern.chainResponsability.DivideNumbers;
import com.pattern.chainResponsability.MultiplyNumbers;
import com.pattern.chainResponsability.SubstractNumbers;
import com.pattern.chainResponsability.entities.Numbers;
import com.pattern.designpatternAbstractFactofy.abstractFactory.AbstractFactory;
import com.pattern.designpatternAbstractFactofy.abstractFactory.AbstractPlugin;
import com.pattern.designpatternAbstractFactofy.abstractFactory.impl.AbstractFactoryImpl1;
import com.pattern.designpatterndecorateur.Boisson;
import com.pattern.designpatterndecorateur.Espresso;
import com.pattern.designpatterndecorateur.dec.Chocolat;
import com.pattern.designpatterndecorateur.dec.Lait;
import com.pattern.designpatterndecorateur.dec.Sucre;
import com.pattern.designpatternstrategy.strategy.Context;
import com.pattern.designpatternstrategy.strategy.impl.StrategyImpl1;
import com.pattern.designpatternstrategy.strategy.impl.StrategyImpl2;
import com.pattern.designpatternstrategy.strategy.impl.StrategyImpl3;

@SpringBootApplication
public class DesignPattern implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPattern.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// decorateur
		Boisson b;
		b = new Espresso();
		b = new Lait(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		b = new Chocolat(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		b = new Chocolat(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		Boisson b1 = new Sucre(new Chocolat(new Lait(new Chocolat(new Lait(new Espresso())))));
		System.out.println(b1.getDescription());
		System.out.println(b1.cout());

		// Strategy

		Context cx = new Context();
		cx.setStrategy(new StrategyImpl1());
		cx.appliquerStrategy();
		cx.setStrategy(new StrategyImpl2());
		cx.appliquerStrategy();
		cx.setStrategy(new StrategyImpl3());
		cx.appliquerStrategy();

		// Abstract Facotry

		// Instanciation statique
		AbstractFactory factory = new AbstractFactoryImpl1();
		AbstractPlugin plugin = factory.getinstance();
		plugin.traitement();
		// Instanciation statique
		AbstractFactory factory1 = (AbstractFactory) Class
				.forName("com.pattern.designpatternAbstractFactofy.abstractFactory.impl.AbstractFactoryImpl2")
				.newInstance();
		AbstractPlugin plugin1 = factory1.getinstance();
		plugin1.traitement();
		
		// Chain of responsabilty
		
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubstractNumbers();
		Chain chain3 = new MultiplyNumbers();
		Chain chain4 = new DivideNumbers();
		
		chain1.setNetChain(chain2);
		chain2.setNetChain(chain3);
		chain3.setNetChain(chain4);
		
		Numbers request = new Numbers(4, 2, "div");
		chain1.calculate(request);

	}
}
