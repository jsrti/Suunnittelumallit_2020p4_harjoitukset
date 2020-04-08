package strategy;

public class QuickSort implements SortStrategy {

	@Override
	public void sort(int[] unsortedArray) {
		quickSort(unsortedArray, 0, unsortedArray.length - 1);
	}

	public static void quickSort(int table[], int lo0, int hi0) {
		int lo = lo0;
		int hi = hi0;
		int mid, swap;

		mid = table[(lo0 + hi0) / 2];
		while (lo <= hi) {
			while (table[lo] < mid) {
				++lo;
			}
			while (table[hi] > mid) {
				--hi;
			}
			if (lo <= hi) {
				swap = table[lo];
				table[lo] = table[hi];
				++lo;
				table[hi] = swap;
				--hi;
			}
		}
		if (lo0 < hi) {
			quickSort(table, lo0, hi);
		}
		if (lo < hi0) {
			quickSort(table, lo, hi0);
		}
	}

	@Override
	public String getName() {
		return "Quicksort";
	}

}
