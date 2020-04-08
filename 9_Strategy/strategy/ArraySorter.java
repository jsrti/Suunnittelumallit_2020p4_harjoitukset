package strategy;

public class ArraySorter {
	private SortStrategy sortStrategy;

	public ArraySorter(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public long timedSort(int[] arrayToBeSorted) {
		long timerStart = System.nanoTime();
		sortStrategy.sort(arrayToBeSorted);
		long timerEnd = System.nanoTime();
		return (timerEnd - timerStart);
	}
	
	public String getSelectedStrategyName() {
		return sortStrategy.getName();
	}
}
