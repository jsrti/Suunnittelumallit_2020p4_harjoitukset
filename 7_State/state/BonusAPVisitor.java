package state;

public class BonusAPVisitor implements PokemonVisitor {

	@Override
	public void visit(Charmander charmander) {
		charmander.increaseAttackPower(1);
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		charmeleon.increaseAttackPower(2);
	}

	@Override
	public void visit(Charizard charizard) {
		charizard.increaseAttackPower(3);
	}

}
