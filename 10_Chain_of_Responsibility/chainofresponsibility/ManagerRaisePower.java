package chainofresponsibility;

public class ManagerRaisePower extends RaisePower {

	private final double ALLOWABLE = 2 * BASE;

	public void processRequest(RaiseRequest request) {
		if (request.getAmount() <= ALLOWABLE) {
			System.out.println("Manager will approve " + request.getAmount() + " %");
		} else {
			super.processRequest(request);
		}
	}
}
