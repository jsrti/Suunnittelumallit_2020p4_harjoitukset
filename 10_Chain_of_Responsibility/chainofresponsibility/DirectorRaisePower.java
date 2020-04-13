package chainofresponsibility;

public class DirectorRaisePower extends RaisePower {
	private final double ALLOWABLE = 5 * BASE;

	public void processRequest(RaiseRequest request) {
		if (request.getAmount() < ALLOWABLE) {
			System.out.println("Director will approve " + request.getAmount() + " %");
		} else {
			super.processRequest(request);
		}
	}
}
