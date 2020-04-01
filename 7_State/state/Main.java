package state;

public class Main {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon(new Charmander(), "Jack");
		Pokemon p2 = new Pokemon(new Charmander(), "Katie");

		for (int i = 0; i < 20; i++) {
			p1.attack(p2);
			p2.attack(p1);
		}
	}

}
