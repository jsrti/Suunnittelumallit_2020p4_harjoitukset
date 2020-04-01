package state;

public class Charizard extends PokemonState {
	private final String name = "Charizard";
	private final int maxHP = 100;
	private final int defencePoints = 4;
	private final int attackPoints = 6;

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

}
