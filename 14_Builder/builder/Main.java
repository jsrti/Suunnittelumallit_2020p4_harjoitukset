package builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		McDonaldsBuilder mc = new McDonaldsBuilder();
		HesburgerBuilder hese = new HesburgerBuilder();
		
		director.setBurgerBuilder(mc);
		director.constructBurger();

		director.setBurgerBuilder(hese);
		director.constructBurger();
	}

}
