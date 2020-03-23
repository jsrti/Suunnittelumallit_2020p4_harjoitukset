package abstractfactory;

public class Wardrobe {

	private Jeans jeans;
	private Cap cap;
	private Shirt shirt;
	private Shoes shoes;
	
	public Wardrobe(ClothingFactory clothingFactory) {
		changeClothes(clothingFactory);
	}
	
	public void changeClothes(ClothingFactory clothingFactory) {
		jeans = clothingFactory.createJeans();
		cap = clothingFactory.createCap();
		shirt = clothingFactory.createShirt();
		shoes = clothingFactory.createShoes();
	}
	
	public void printClothes() {
		System.out.println("Wearing now: ");
		System.out.println(jeans);
		System.out.println(cap);
		System.out.println(shirt);
		System.out.println(shoes);
		System.out.println();
	}
}
