package prototype;

public class Main {

	public static void main(String[] args) {
		BasicClock clock = new BasicClock();
		clock.setTime(4, 12, 20);
		
		BasicClock shallowClone = (BasicClock) clock.shallowClone();
		BasicClock deepCopy = (BasicClock) clock.clone();
		
		//kellot samassa ajassa
		System.out.println(clock.getTime());
		System.out.println(shallowClone.getTime());
		System.out.println(deepCopy.getTime());
		System.out.println();
		
		//kopion muuttaminen muuttaa myös alkuperäisen kellon aikaa (jaetut viisarit)
		shallowClone.setTime(3, 14, 45);
		System.out.println(clock.getTime());
		System.out.println(shallowClone.getTime());
		System.out.println(deepCopy.getTime());
		System.out.println();
		
		//syväkopion muokkaus ei vaikuta muihin kelloihin
		deepCopy.setTime(1, 11, 11);
		System.out.println(clock.getTime());
		System.out.println(shallowClone.getTime());
		System.out.println(deepCopy.getTime());
	}

}
