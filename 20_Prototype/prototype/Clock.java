package prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Clock implements Cloneable {
	protected List<ClockHand> hands = new ArrayList<>();

	public void addHand(ClockHand c) {
		hands.add(c);
	}
	
	public List<ClockHand> getHands(){
		return hands;
	}
	
	public Object shallowClone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Clock clone() {
		// syväkopio
		Clock s = null;
		try {
			s = (Clock) super.clone();
			s.hands = new ArrayList<ClockHand>();
			for (ClockHand v : hands) {
				s.hands.add((ClockHand) v.clone());
			}

		} catch (CloneNotSupportedException e) {
		}
		return s;
	}
}
