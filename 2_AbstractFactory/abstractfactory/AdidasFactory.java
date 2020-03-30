package abstractfactory;

public class AdidasFactory extends ClothingFactory {

	// Singleton, lazy initialization/synchronized instance creation
	private static volatile AdidasFactory instance = null;

	private AdidasFactory() {
	}

	public static AdidasFactory getInstance() {
		if (instance == null) {
			synchronized (BossFactory.class) {
				if (instance == null) {
					instance = new AdidasFactory();
				}
			}
		}

		return instance;
	}

	@Override
	public Jeans createJeans() {
		return new AdidasJeans();
	}

	@Override
	public Shirt createShirt() {
		return new AdidasShirt();
	}

	@Override
	public Cap createCap() {
		return new AdidasCap();
	}

	@Override
	public Shoes createShoes() {
		return new AdidasShoes();
	}

}
