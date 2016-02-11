package p1;

public class Drone {

	public int x;
	public int y;
	public int startOrder;
	public int durationOrder;

	public Drone() {
		x = 0;
		y = 0;
		startOrder = -1;
		durationOrder = -1;
	}

	public boolean checkFinishedNoDeliver(int actualTurn) {
		if (startOrder + durationOrder > actualTurn) {
			boolean returned = true;
			startOrder = -1;
			durationOrder = -1;
			return returned;
		} else {
			return false;
		}
	}
	
	public boolean checkFinishedDeliver(int actualTurn) {
		if (startOrder + durationOrder + 1 > actualTurn) {
			boolean returned = true;
			startOrder = -1;
			durationOrder = -1;
			return returned;
		} else {
			return false;
		}
	}
}
