package chainofresponsibility;

public class RaiseRequest {
	private double amount;
	private String purpose;

	public RaiseRequest(double amount, String purpose) {
		this.amount = amount;
		this.purpose = purpose;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amt) {
		amount = amt;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String reason) {
		purpose = reason;
	}
}
