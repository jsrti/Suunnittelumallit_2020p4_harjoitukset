package decorator;

public class Onion extends PizzaDecorator{

	private double price = 0.5;
	private String description = "onion";
	
	public Onion(Pizza pizzaToBeDecorated) {
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
