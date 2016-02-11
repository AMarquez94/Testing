package p1;

import java.util.HashMap;

public class Warehouse {

	// Producto es la clave
	public HashMap<Product, Integer> STOCK;
	public int x;
	public int y;

	public Warehouse() {
		STOCK = new HashMap<Product, Integer>();
		x = 0;
		y = 0;
	}

	public void addItems(Product p, int quantity) {
		if (STOCK.containsKey(p)) {
			int prevQuantity = STOCK.get(p);
			STOCK.remove(p);
			STOCK.put(p, prevQuantity + quantity);
		} else {
			STOCK.put(p, quantity);
		}
	}

	public boolean removeItems(Product p, int quantity) {
		if (STOCK.containsKey(p)) {
			int prevQuantity = STOCK.get(p);
			if (prevQuantity < quantity)
				return false;
			else {
				STOCK.remove(p);
				STOCK.put(p, prevQuantity - quantity);
				return true;
			}
		} else {
			return false;
		}
	}
}
