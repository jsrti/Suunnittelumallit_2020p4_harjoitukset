package state;

public interface PokemonVisitor {
	public void visit(Charmander charmander);
	public void visit(Charmeleon charmeleon);
	public void visit(Charizard charizard);
}
