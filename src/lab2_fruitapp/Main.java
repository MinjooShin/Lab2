package lab2_fruitapp;

import java.util.*;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1=new Fruit(1, "Apple", 1000);
		fl.add(s1);
		Fruit s2=new Fruit(2, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(3, "Kiwi", 2000));
		fl.add(new Fruit(4, "Grape", 3000));
		fl.add(new Fruit(5, "Melon", 4000));
		fl.add(new Fruit(6, "Plum", 4500));
		fl.add(new Fruit(7, "Peach", 5500));
		fl.add(new Fruit(8, "Tomato", 5000));
		fl.add(new Fruit(9, "Watermelon", 6000));
		fl.add(new Fruit(10, "Banana", 6800));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.print("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
