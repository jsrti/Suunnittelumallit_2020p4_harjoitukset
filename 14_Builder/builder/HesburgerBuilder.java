package builder;

public class HesburgerBuilder implements BurgerBuilder {

	private StringBuilder burger;

	@Override
	public void createNewBurgerProduct() {
		burger = new StringBuilder();
	}

	public StringBuilder getBurger() {
		return this.burger;
	}

	@Override
	public void createBuns() {
		burger.append("boiled buns");
	}

	@Override
	public void createSteak() {
		burger.append("&tuna steak");
	}

	@Override
	public void createCheese() {
		burger.append("&mozzarella cheese");
	}

	@Override
	public void createSalad() {
		burger.append("&carrot slices");
	}

}
