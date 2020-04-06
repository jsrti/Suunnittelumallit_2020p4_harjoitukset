package pokemongame;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	private String name;
	private int maxOwnedPokemons;
	private List<Pokemon> ownedPokemons = new ArrayList<>();
	private Pokemon activePokemon;

	public Trainer(String name) {
		this.name = name;
		maxOwnedPokemons = 3;
	}

	public String getName() {
		return this.name;
	}

	public Pokemon getActivePokemon() {
		return activePokemon;
	}

	public int getMaxOwnedPokemons() {
		return maxOwnedPokemons;
	}

	public void addPokemon(Pokemon p) {
		if (ownedPokemons.size() < maxOwnedPokemons) {
			ownedPokemons.add(p);
			p.setOwner(this);
			if (activePokemon == null)
				activePokemon = p;
		} else {
			System.out.println("Can't have more pokemons.");
		}
	}

	public void switchPokemon() {
		for (Pokemon p : ownedPokemons) {
			if (p.getCurrentHP() > 0) {
				activePokemon = p;
				System.out.println(name + ": I choose you, " + activePokemon.getName() + "!\n");
				break;
			}
		}
		if (activePokemon.getCurrentHP() == 0) {
			System.out.println(name + " has no more pokemons!\n");
		}
	}

	public void attack(Pokemon enemy) {
		if (activePokemon.getCurrentHP() > 0)
			activePokemon.attack(enemy);
		else
			switchPokemon();
	}
}
