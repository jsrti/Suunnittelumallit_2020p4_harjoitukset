package decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pizza> menu = new ArrayList<Pizza>();
		
		Pizza base = new PizzaBase();
		
		menu.add(new Cheese(new Pepperoni(base)));		
		menu.add(new Cheese(new Bacon(base)));
		menu.add(new Cheese(new Jalapeno(new Bacon(new Onion(new Pepperoni(base))))));
		
		System.out.println("Menu:\n");
		for(Pizza p:menu) {
			System.out.print(p.getPrice());
			System.out.println("\t" + p.getDescription());
		}
	}
}
