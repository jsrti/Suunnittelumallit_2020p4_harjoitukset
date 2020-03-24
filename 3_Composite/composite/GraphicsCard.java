package composite;

public class GraphicsCard implements Component {
	private int price = 400;
	
	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
