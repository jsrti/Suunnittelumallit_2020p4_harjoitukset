package state;

public class Charmeleon extends PokemonState {

	private final String name = "Charmeleon";
	private final int requiredXP = 10;
	private final int maxHP = 60;
	private int defencePoints = 3;
	private int attackPoints = 4;

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
