package abstractfactory;

public class Main {

	public static void main(String[] args) {
		Wardrobe wardrobe = new Wardrobe(new AdidasFactory());
		wardrobe.printClothes();
		
		wardrobe.changeClothes(new BossFactory());
		wardrobe.printClothes();	
	}

}
