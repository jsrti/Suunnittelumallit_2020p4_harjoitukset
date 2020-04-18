package builder;

public class McDonaldsBuilder implements BurgerBuilder {

	private Burger burger = new Burger();

	@Override
	public void createNewBurgerProduct() {
		burger = new Burger();
	}
	
	public Burger getBurger() {
		return this.burger;
	}

	@Override
	public void createBuns() {
		burger.addComponent(new Buns());
	}

	@Override
	public void createSteak() {
		burger.addComponent(new Steak());
	}

	@Override
	public void createCheese() {
		burger.addComponent(new Cheese());
	}

	@Override
	public void createSalad() {
		burger.addComponent(new Salad());
	}

}
