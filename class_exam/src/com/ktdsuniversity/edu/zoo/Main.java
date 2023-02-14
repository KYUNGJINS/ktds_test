package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Animal;
import com.ktdsuniversity.edu.zoo.inf.Crawlable;
import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Main {

	public static void run(Animal animal) {
		animal.eat();
		animal.bark();
		
		// 만약 animal이 Walkable의 객체라면~
		if (animal instanceof Walkable) {
			((Walkable) animal).walk();
		}
		// 만약 animal이 Runalbe의 객체라면~
		if (animal instanceof Runable) {
			((Runable) animal).run();
		}
		// 만약 animal이 Flyable의 객체라면~
		if (animal instanceof Flyable) {
			((Flyable) animal).fly();
		}
		// 만약 animal이 Swimable의 객체라면~
		if (animal instanceof Swimable) {
			((Swimable) animal).swim();
		}
		// 만약 animal이 Crawlable의 객체라면~
		if (animal instanceof Crawlable) {
			((Crawlable) animal).crawl();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("메리");
		Walkable wLion = new Lion("초코");
		Runable rLion = new Lion("복실이");
		Swimable sLion = new Lion("애기");
		
		lion.eat();
		lion.bark();
		wLion.walk();
		rLion.run();
		sLion.swim();
	}
	
}
