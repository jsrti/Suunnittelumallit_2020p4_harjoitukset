package chainofresponsibility;

public class CEORaisePower extends RaisePower {
	public void processRequest(RaiseRequest request) {
		System.out.println("CEO will approve " + request.getAmount() + " %");
	}
}
