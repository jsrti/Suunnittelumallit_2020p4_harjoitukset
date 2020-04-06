package pokemongame;

public class Charmeleon extends PokemonState {

	private final String name = "Charmeleon";
	private final int requiredXP = 10;
	private final int maxHP = 60;
	private final int defencePoints = 3;
	private final int attackPoints = 4;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void evolve(Pokemon p) {
		p.evolve(new Charizard());
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
