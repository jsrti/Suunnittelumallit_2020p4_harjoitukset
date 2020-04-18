package builder;

public class Director {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		burgerBuilder = bb;
	}
	
	public void constructBurger() {
		burgerBuilder.createNewBurgerProduct();
		burgerBuilder.createBuns();
		burgerBuilder.createSteak();
		burgerBuilder.createCheese();
		burgerBuilder.createSalad();
	}
}
