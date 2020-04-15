package memento;

import java.util.Random;

//caretaker, memento tallessa (Object obj)
public class Arvaaja implements Runnable{
	private static int tunnisteNumero = 0;
	private String nimi;
	private Object obj;
	private Arvuuttaja arvuuttaja;
	private boolean isRunning = true;
	private int suurinLuku;
	private Random random = new Random();
	
	public Arvaaja(int suurinLuku, Arvuuttaja arvuuttaja) {
		nimi = "Thread_" + tunnisteNumero;
		tunnisteNumero++;
		this.suurinLuku = suurinLuku;
		this.arvuuttaja = arvuuttaja;
	}
	
	private void liityPeliin (){
		this.obj=arvuuttaja.liityPeliin(suurinLuku);
	}
	
	private boolean arvaa() {	
		int arvaus = random.nextInt(suurinLuku);
		//System.out.println(nimi + " arvaus:"  + arvaus);
		return arvuuttaja.arvaa(arvaus, obj);
	}

	@Override
	public void run() {
		liityPeliin();
		int arvaukset = 0;
		while(isRunning) {
			arvaukset++;
			if(arvaa()){
				System.out.println(nimi + " arvasi oikein! Arvaukset: " + arvaukset);
				isRunning = false;
			}
		}
	}
}
