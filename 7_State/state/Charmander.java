package state;

public class Charmander extends PokemonState {

	private final String name = "Charmander";
	private final int requiredXP = 5;
	private final int maxHP = 30;
	private final int defencePoints = 1;
	private final int attackPoints = 2;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void evolve(Pokemon p) {
		p.evolve(new Charmeleon());
	}

	@Override
	public int getRequiredXP() {
		return requiredXP;
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
