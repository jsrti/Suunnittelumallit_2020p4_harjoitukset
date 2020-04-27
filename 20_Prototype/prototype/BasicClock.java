package prototype;

public class BasicClock extends Clock{
	
	public BasicClock() {
		addHand(new ClockHand(12));
		addHand(new ClockHand(60));
		addHand(new ClockHand(60));
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		hands.get(0).setCurrentTime(hours);
		hands.get(1).setCurrentTime(minutes);
		hands.get(2).setCurrentTime(seconds);
	}
	
	public String getTime() {
		String hours = String.valueOf(hands.get(0).getCurrentTime());
		String minutes = String.valueOf(hands.get(1).getCurrentTime());
		String seconds = String.valueOf(hands.get(2).getCurrentTime());
		
		return hours + ":" + minutes + ":" + seconds;
	}
	
	public ClockHand getSecondHand() {
		return hands.get(2);
	}

	public ClockHand getMinuteHand() {
		return hands.get(1);
	}

	public ClockHand getHourHand() {
		return hands.get(0);
	}
}
