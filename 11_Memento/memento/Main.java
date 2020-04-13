package memento;

public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		int suurinLuku = 10;
		
		for(int i = 0; i<5;i++) {
			new Thread(new Arvaaja(suurinLuku, arvuuttaja)).start();
		}

	}

}
