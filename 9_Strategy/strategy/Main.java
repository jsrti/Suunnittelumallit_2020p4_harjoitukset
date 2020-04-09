package strategy;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArraySorter arraySorter;

		int[] testArrayBase = generateUnsortedArray(50000);

		arraySorter = new ArraySorter(new SelectSort());
		testSortTiming(arraySorter, testArrayBase);

		arraySorter.setStrategy(new MergeSort());
		testSortTiming(arraySorter, testArrayBase);

		arraySorter.setStrategy(new QuickSort());
		testSortTiming(arraySorter, testArrayBase);
	}

	private static void testSortTiming(ArraySorter sorter, int[] unsortedArray) {
		int[] testArrayClone = unsortedArray.clone();
		// printArray(testArrayClone);
		long time = sorter.timedSort(testArrayClone);
		// printArray(testArrayClone);
		System.out.println(sorter.getSelectedStrategyName() + ": " + time / 1000000f + " ms");
	}

	private static void printArray(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (i > 0 && i % 40 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	private static int[] generateUnsortedArray(int size) {
		int[] arr = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = r.nextInt(1000);
		}

		return arr;
	}

}
