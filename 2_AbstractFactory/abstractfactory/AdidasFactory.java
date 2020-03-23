package abstractfactory;

public class AdidasFactory extends ClothingFactory{

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
