package p1;

public class Calc {

	public static int distanceTurns(int origX, int origY, int destX, int destY){
		return (int) Math.ceil(Math.sqrt(Math.pow(Math.abs(origX-destX), 2) + Math.pow(Math.abs(origX-destX), 2)));
	}
}
