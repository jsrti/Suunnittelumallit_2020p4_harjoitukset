package decorator;

public class Jalapeno extends PizzaDecorator{

	private double price = 0.8;
	private String description = "jalapeno";
	
	public Jalapeno(Pizza pizzaToBeDecorated) {
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
