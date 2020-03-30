package abstractfactory;

public class BossFactory extends ClothingFactory {

	// Singleton, lazy initialization/synchronized instance creation
	private static volatile BossFactory instance = null;

	private BossFactory() {
	}

	public static BossFactory getInstance() {
		if (instance == null) {
			synchronized (BossFactory.class) {
				if (instance == null) {
					instance = new BossFactory();
				}
			}
		}

		return instance;
	}

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
