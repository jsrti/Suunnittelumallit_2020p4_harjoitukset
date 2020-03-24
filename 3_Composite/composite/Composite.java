package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Component {
	private List<Component> components = new ArrayList<Component>();
	private int price;
	
	public Composite(int price) {
		this.price = price;
	}
	
	@Override
	public int calculatePrice() {
		int totalPrice = price;
		for(Component c: components) {
			totalPrice+=c.calculatePrice();
		}
		return totalPrice;
	}
	
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}

}
