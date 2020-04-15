package state;

public class Charizard extends PokemonState {
	private final String name = "Charizard";
	private final int maxHP = 100;
	private int defencePoints = 4;
	private int attackPoints = 6;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void evolve(Pokemon p) {
		// no evolution
	}

	@Override
	public int getRequiredXP() {
		return 0;
	}

	@Override
	public int getMaxHP() {
		return maxHP;
	}

	@Override
	public int getDefence() {
		return defencePoints;
	}

	@Override
	public int getAttackPower() {
		return attackPoints;
	}

	@Override
	protected void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	protected void increaseAttackPower(int ap) {
		attackPoints+=ap;
		System.out.println("AP increased by " + ap + "!\n");
	}

}
