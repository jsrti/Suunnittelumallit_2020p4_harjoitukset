package state;

public class Main {

	public static void main(String[] args) {
		BonusAPVisitor bonus = new BonusAPVisitor();
		Pokemon p1 = new Pokemon(new Charmander(), "Jack");
		Pokemon p2 = new Pokemon(new Charmander(), "Katie");

		for (int i = 0; i < 9; i++) {
			p1.attack(p2);
			p2.attack(p1);
			p2.accept(bonus);
		}
	}

}
