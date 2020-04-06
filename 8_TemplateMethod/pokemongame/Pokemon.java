package pokemongame;

public class Pokemon {
	private PokemonState currentState;
	private int currentHP;
	private int currentXP;
	private Trainer owner;

	public Pokemon(PokemonState startState, Trainer owner) {
		this.currentState = startState;
		this.currentHP = currentState.getMaxHP();
		this.owner = owner;
	}
	
	public Pokemon(PokemonState startState) {
		this(startState, null);
	}

	public void attack(Pokemon enemy) {
		if (enemy.currentHP > 0)
			currentState.attack(this, enemy);
	}

	public String getName() {
		return currentState.getName();
	}
	
	public void setOwner(Trainer owner) {
		this.owner = owner;
	}

	// change state
	protected void evolve(PokemonState nextState) {
		System.out.print(getOwner().getName() + "'s " + getName() + " evolved into ");
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
		System.out.println(owner.getName() + "'s " + getName() + " took " + damage + " damage.");
		if (currentHP - damage > 0) {
			currentHP-=damage;	
			System.out.println("HP left: " + getCurrentHP() + "\n");
		} else {
			currentHP = 0;
			System.out.println(owner.getName() + "'s " + getName() + " faints.\n");
		}
	}

	protected void increaseCurrentXP(int xp) {
		this.currentXP += xp;
	}

	public Trainer getOwner() {
		return this.owner;
	}
}
