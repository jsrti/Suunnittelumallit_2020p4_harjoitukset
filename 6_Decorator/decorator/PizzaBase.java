package decorator;

public class PizzaBase implements Pizza {

	private String description = "Wood-fired base";
	private double price = 4;
	
	@Override
	public String getDescription() {
		return description;

	}

	@Override
	public double getPrice() {
		return price;
	}

}
