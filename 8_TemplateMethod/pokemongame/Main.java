package pokemongame;

public class Main {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon(new Charmander());
		Pokemon p2 = new Pokemon(new Charmander());
		Pokemon p3 = new Pokemon(new Charizard());
		
		Trainer katie = new Trainer("Katie");
		katie.addPokemon(p1);
		
		Trainer jack = new Trainer("Jack");
		jack.addPokemon(p2);
		jack.addPokemon(p3);
		
		for (int i = 0; i < 20; i++) {
			katie.attack(jack.getActivePokemon());
			jack.attack(katie.getActivePokemon());
		}
	}

}
