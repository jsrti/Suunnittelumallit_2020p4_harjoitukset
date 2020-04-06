package templatemethod;

public class Main {
	public static void main(String[] args) {
		Game game = new PokemonGame();
		game.playOneGame(2);
		game.initializeGame();
	}
}
