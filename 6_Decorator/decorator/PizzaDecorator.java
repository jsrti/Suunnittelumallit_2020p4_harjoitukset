package decorator;

public abstract class PizzaDecorator implements Pizza {

	private Pizza pizzaToBeDecorated;

	public PizzaDecorator(Pizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}
	
	@Override
	public String getDescription() {
		return pizzaToBeDecorated.getDescription() + ", " + getDecorationDescription();
	}

	protected abstract String getDecorationDescription();
	
	@Override
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + getDecorationPrice();
	}
	
	protected abstract double getDecorationPrice();

}
