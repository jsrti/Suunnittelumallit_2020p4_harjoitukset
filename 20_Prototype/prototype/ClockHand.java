package prototype;

public class ClockHand implements Cloneable {

	private int maxTime;
	private int currentTime = 0;

	public ClockHand(int maxTime) {
		this.maxTime = maxTime;
	}

	public double getCurrentAngle() {
		return currentTime / maxTime * 360;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		if(currentTime > 0 && currentTime < maxTime)
			this.currentTime = currentTime;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
