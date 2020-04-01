package decorator;

public class Pepperoni extends PizzaDecorator{

	private double price = 1.1;
	private String description = "pepperoni";
	
	public Pepperoni(Pizza pizzaToBeDecorated) {
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
