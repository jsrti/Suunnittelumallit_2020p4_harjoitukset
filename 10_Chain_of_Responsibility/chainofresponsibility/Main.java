package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		RaisePower manager = new ManagerRaisePower();
		RaisePower director = new DirectorRaisePower();
		RaisePower ceo = new CEORaisePower();

		manager.setSuccessor(director);
		director.setSuccessor(ceo);

		try {
			while (true) {
				System.out.println("Enter the percentage to check who should approve your raise.");
				System.out.print(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new RaiseRequest(d, "bonus"));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}

}
