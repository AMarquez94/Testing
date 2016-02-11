package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Order {

	public HashMap<Product, Integer> LIST;
	public ArrayList<Product> PLAIN_ORDER;
	public int x;
	public int y;
	public int TOTALWEIGHT;
	
	public Order(){
		LIST = new HashMap<Product, Integer>();
		PLAIN_ORDER = new ArrayList<Product>();
		x = 0;
		y = 0;
		TOTALWEIGHT = 0;
	}
	
	public void addItems(Product p, int quantity){
		if(LIST.containsKey(p)){
			int prevQuantity = LIST.get(p);
			LIST.remove(p);
			LIST.put(p, prevQuantity + quantity);
		} else{
			LIST.put(p, quantity);
		}
		TOTALWEIGHT = TOTALWEIGHT + p.WEIGHT;
		for(int i = 0; i < quantity; i++){
			PLAIN_ORDER.add(p);
		}
	}
	
	public void sortProductsByLessWeight(){
		Collections.sort(PLAIN_ORDER, new WeightComparator());
	}
}
