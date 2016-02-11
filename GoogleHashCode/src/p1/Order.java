package p1;

import java.util.HashMap;

public class Order {

	public HashMap<Product, Integer> LIST;
	public int x;
	public int y;
	
	public Order(){
		LIST = new HashMap<Product, Integer>();
		x = 0;
		y = 0;
	}
	
	public void addItems(Product p, int quantity){
		if(LIST.containsKey(p)){
			int prevQuantity = LIST.get(p);
			LIST.remove(p);
			LIST.put(p, prevQuantity + quantity);
		} else{
			LIST.put(p, quantity);
		}
	}
}
