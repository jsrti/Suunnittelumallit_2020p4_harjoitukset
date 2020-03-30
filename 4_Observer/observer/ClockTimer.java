package observer;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class ClockTimer extends Observable implements Runnable {
	private volatile boolean stop = false;
	private int currentHour;
	private int currentMinute;
	private int currentSecond;

	public ClockTimer() {
		super();
	}

	public int getHour() {
		return currentHour;
	}

	public int getMinute() {
		return currentMinute;
	}

	public int getSecond() {
		return currentSecond;
	}

	private void tick() {
		long millis = System.currentTimeMillis();
		currentHour = (int) (TimeUnit.MILLISECONDS.toHours(millis) % 24);
		currentMinute = (int) (TimeUnit.MILLISECONDS.toMinutes(millis) % 60);
		int second = (int) (TimeUnit.MILLISECONDS.toSeconds(millis) % 60);
		if (second != currentSecond) {
			currentSecond = second;
			setChanged();
			notifyObservers();
		}
	}

	@Override
	public void run() {
		while (!stop) {
			tick();
		}
	}
	
	public void requestStop() {
        stop = true;
    }
}
