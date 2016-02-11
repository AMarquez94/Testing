package p1;

import java.util.ArrayList;

public class Drone {

	public int x;
	public int y;
	public int maxWeight;
	public int startOrder;
	public int durationOrder;
	public boolean ocupado;
	public boolean cargado;
	public ArrayList<Product> carga;
	public Order order;

	public Drone(int w) {
		maxWeight = w;
		x = 0;
		y = 0;
		startOrder = -1;
		durationOrder = -1;
		ocupado = false;
		cargado = false;
		carga = new ArrayList<Product>();
	}
	
	public boolean checkFinished(int actualTurn, boolean wait) {
		int sum = 1;
		if(wait)
			sum = 0;
		if(startOrder == -1 || durationOrder==-1){
			return true;
		}
		if (startOrder + durationOrder + sum > actualTurn) {
			boolean returned = true;
			startOrder = -1;
			durationOrder = -1;
			ocupado = false;
			return returned;
		} else {
			return false;
		}
	}
	
	public void addOrder(Order o){
		order = o;
	}
	
	public void load(int droneId, int turno, Warehouse w){
		startOrder = turno;
		durationOrder = Calc.distanceTurns(x, y, w.x, w.y);
		Product p = order.PLAIN_ORDER.get(0);
		carga.add(p);
		int i = 1;
		int count = 1;
		while(i<order.PLAIN_ORDER.size() && order.PLAIN_ORDER.get(i).TYPE == p.TYPE){
			count++;
		}
		order.PLAIN_ORDER.remove(0);
		while(count>1){
			order.PLAIN_ORDER.remove(0);
			count--;
		}
		System.out.println(droneId + " L 0 " + p.TYPE + " " + count);
		cargado = true;
		ocupado = true;
		
	}
}
