package state;

abstract class PokemonState {
	protected abstract String getName();

	protected abstract int getRequiredXP();

	protected abstract void evolve(Pokemon p);

	protected abstract int getMaxHP();

	protected abstract int getDefence();

	protected abstract int getAttackPower();

	protected void attack(Pokemon player, Pokemon enemy) {
		System.out.println(player.getOwner() + "'s " + player.getName() + " attacks.");
		int damage = getAttackPower() - enemy.getDefence();
		if (damage > 0) {
			enemy.takeDamage(damage);
			player.increaseCurrentXP(1);
			if (getRequiredXP() > 0 && player.getCurrentXP() >= getRequiredXP()) {
				evolve(player);
			}
		} else {
			System.out.println("It's not very effective...\n");
		}
	}
}
