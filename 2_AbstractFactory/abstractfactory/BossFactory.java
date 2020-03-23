package abstractfactory;

public class BossFactory extends ClothingFactory{

	@Override
	public Jeans createJeans() {
		return new BossJeans();
	}

	@Override
	public Shirt createShirt() {
		return new BossShirt();
	}

	@Override
	public Cap createCap() {
		return new BossCap();
	}

	@Override
	public Shoes createShoes() {
		return new BossShoes();
	}

}
