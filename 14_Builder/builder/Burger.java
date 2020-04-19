package builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
	private List<BurgerComponent> components = new ArrayList<BurgerComponent>();

	public void addComponent(BurgerComponent b) {
		components.add(b);
	}

	public List<BurgerComponent> getComponents() {
		return components;
	}

	@Override
	public String toString() {
		String ingredients = "";
		for (BurgerComponent c : components) {
			ingredients += c.getDescription();
			ingredients += ", ";
		}

		return ingredients.substring(0, ingredients.length() - 2);
	}
}
