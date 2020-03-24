package composite;

public class Main {

	public static void main(String[] args) {
		Component cpu = new CPU();
		Component network = new NetworkCard();
		Component gpu = new GraphicsCard();
		Component ram = new RAM();
		
		Composite mb = new Motherboard(120);
		System.out.println("Motherboard: " + mb.calculatePrice());
		mb.addComponent(network);
		mb.addComponent(cpu);
		mb.addComponent(ram);
		mb.addComponent(gpu);
		System.out.println("Motherboard including components: " + mb.calculatePrice());
		
		Composite computerCase = new Case(100);
		computerCase.addComponent(mb);
		System.out.println("Case including components: " + computerCase.calculatePrice());
		
		Composite computerCase2 = new Case(100);
		computerCase2.addComponent(mb);
		
		Component[] order = {computerCase, computerCase2};
		int totalPrice = 0;
		for(Component c: order) {
			totalPrice+=c.calculatePrice();
		}
		System.out.println("Total (2 cases including same components): " + totalPrice);
	}

}
