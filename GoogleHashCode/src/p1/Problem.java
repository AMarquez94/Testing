package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem {

	public ArrayList<Drone> DRONES;
	public ArrayList<Warehouse> WAREHOUSES;
	public ArrayList<Order> ORDERS;
	public ArrayList<Product> PRODUCT_TYPES;
	public HashMap<Product, Integer> WEIGHTS;
	public int ROWS;
	public int COLS;
	public int MAXTURNS;
	public int MAXPAYLOAD;
	
	public Problem(){
		DRONES = new ArrayList<Drone>();
		WAREHOUSES = new ArrayList<Warehouse>();
		ORDERS = new ArrayList<Order>();
		PRODUCT_TYPES = new ArrayList<Product>();
		WEIGHTS = new HashMap<Product, Integer>();
		ROWS = 0;
		COLS = 0;
		MAXTURNS = 0;
		MAXPAYLOAD = 0;
	}
	
	public String toString(){
		for(int i = 0; i < ROWS; i++){
			for(int j = 0; j < COLS; j++){
				
			}
		}
		return "";
	}
	
	public void sortOrdersByLessWeight(){
		Collections.sort(ORDERS, new TotalWeightComparator());
	}
}
