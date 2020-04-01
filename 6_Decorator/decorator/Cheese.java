package decorator;

public class Cheese extends PizzaDecorator{

	private double price = 1.50;
	private String description = "cheese";
	
	public Cheese(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	@Override
	public double getDecorationPrice() {
		return price;
	}

	@Override
	protected String getDecorationDescription() {
		return description;
	}
}
