package templatemethod;

import java.util.Scanner;

import pokemongame.Charmander;
import pokemongame.Pokemon;
import pokemongame.Trainer;

public class PokemonGame extends Game {

	private boolean endOfGame = false;
	private Scanner scanner = new Scanner(System.in);
	private Trainer[] trainers = new Trainer[2];
	private Trainer loser;

	@Override
	void initializeGame() {
		if (playersCount != 2) {
			System.out.println("This game supports just 2 players. Starting a game with 2 players.");
			playersCount = 2;
		}

		for (int i = 0; i < playersCount; i++) {
			System.out.println("Player " + (i + 1) + ", enter trainer name");
			String name = scanner.nextLine();
			trainers[i] = new Trainer(name);
			System.out.println("Good luck, trainer " + name + "!\n");
			for (int j = 0; j < trainers[i].getMaxOwnedPokemons(); j++) {
				trainers[i].addPokemon(new Pokemon(new Charmander()));
			}
		}

	}

	@Override
	void makePlay(int player) {
		System.out.println(trainers[player].getName() + ": Type 1 to attack.");
		int i = scanner.nextInt();
		
		int enemy = player == 0 ? 1 : 0;
		trainers[player].attack(trainers[enemy].getActivePokemon());
		if(trainers[player].getActivePokemon().getCurrentHP()==0) {
			loser = trainers[player];
			endOfGame = true;
		}
	}

	@Override
	boolean endOfGame() {
		return endOfGame;
	}

	@Override
	void printWinner() {
		System.out.println("Game over, " + loser.getName() + " lost the match!");
	}

}
