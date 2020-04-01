package state;

public class Pokemon {
	private PokemonState currentState;
	private int currentHP;
	private int currentXP;
	private String owner;

	public Pokemon(PokemonState startState, String owner) {
		this.currentState = startState;
		this.currentHP = currentState.getMaxHP();
		this.owner = owner;
	}

	public void attack(Pokemon enemy) {
		if (enemy.currentHP > 0)
			currentState.attack(this, enemy);
	}

	public String getName() {
		return currentState.getName();
	}

	// change state
	protected void evolve(PokemonState nextState) {
		System.out.print(getOwner() + "'s " + getName() + " evolved into ");
		currentState = nextState;
		System.out.println(getName() + "!");
		System.out.println("HP increased to: " + currentState.getMaxHP());
		System.out.println("Defence increased to: " + currentState.getDefence());
		System.out.println();
	}

	public int getDefence() {
		return currentState.getDefence();
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public int getCurrentXP() {
		return currentXP;
	}

	protected void takeDamage(int damage) {
		if (currentHP - damage > 0) {
			System.out.println(owner + "'s " + getName() + " took " + damage + " damage.");
			System.out.println("HP left: " + getCurrentHP() + "\n");
		} else {
			currentHP = 0;
			System.out.println(owner + "'s " + getName() + " faints.");
		}
	}

	protected void increaseCurrentXP(int xp) {
		this.currentXP += xp;
	}

	public String getOwner() {
		return this.owner;
	}
}
