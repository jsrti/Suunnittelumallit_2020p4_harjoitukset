package composite;

public class CPU implements Component{
	private int price = 250;
	
	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
