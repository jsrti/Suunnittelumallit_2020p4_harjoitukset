package memento;

import java.util.Random;

public class Arvuuttaja {
	private static Random random = new Random();

	public Object liityPeliin(int suurinLuku) {
		Memento m = new Memento(random.nextInt(suurinLuku));
		return m;
	}

	public boolean arvaa(int arvaus, Object obj) {
		boolean oikeinArvattu = false;
		Memento memento = (Memento) obj;
		if (arvaus == memento.arvattava) {
			oikeinArvattu = true;
		}
		return oikeinArvattu;
	}

	private class Memento {
		private int arvattava;

		public Memento(int arvattava) {
			this.arvattava = arvattava;
		}
	}
}
