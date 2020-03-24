package composite;

public class NetworkCard implements Component {
	private int price = 20;
	
	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
