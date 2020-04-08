package strategy;

public class SelectSort implements SortStrategy {

	@Override
	public void sort(int[] unsortedArray) {
		int i, j, apu, pienin;
		for (i = 0; i < unsortedArray.length; i++) {
			pienin = i;
			for (j = i + 1; j < unsortedArray.length; j++) {
				/* löytyykö taulukon loppupäästä pienempää alkiota? */
				if (unsortedArray[j] < unsortedArray[pienin]) {
					pienin = j;
				}
			}
			if (pienin != i) {
				/* jos löytyi suoritetaan alkioiden vaihto */
				apu = unsortedArray[pienin];
				unsortedArray[pienin] = unsortedArray[i];
				unsortedArray[i] = apu;
			}
		}
	}

	@Override
	public String getName() {
		return "Select sort";
	}

}
