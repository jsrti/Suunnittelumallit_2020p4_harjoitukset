package composite;

public class RAM implements Component {
	private int price = 50;
	
	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
