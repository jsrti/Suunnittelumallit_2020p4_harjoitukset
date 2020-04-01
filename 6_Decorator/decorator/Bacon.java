package decorator;

public class Bacon extends PizzaDecorator{

	private double price = 1.6;
	private String description = "bacon";
	
	public Bacon(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	@Override
	protected String getDecorationDescription() {
		return description;
	}

	@Override
	protected double getDecorationPrice() {
		return price;
	}

}
