package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

	public static Problem parse(String file) throws FileNotFoundException {
		Scanner f = new Scanner(new File(file));
		Problem p = new Problem();

		// Rows
		p.ROWS = f.nextInt();

		// Columns
		p.COLS = f.nextInt();

		// Drone number
		int drones = f.nextInt();

		// Turns
		p.MAXTURNS = f.nextInt();

		// Max payload
		p.MAXPAYLOAD = f.nextInt();

		f.nextLine();

		// Product types
		int productTypes = f.nextInt();

		f.nextLine();

		// Weights of products
		for (int i = 0; i < productTypes; i++) {
			Product temp = new Product();
			temp.TYPE = i;
			temp.WEIGHT = f.nextInt();
			p.PRODUCT_TYPES.add(temp);
			p.WEIGHTS.put(temp, temp.WEIGHT);
		}

		f.nextLine();

		// Number of warehouses
		int warehouseNumber = f.nextInt();

		f.nextLine();

		// Warehouses
		for (int i = 0; i < warehouseNumber; i++) {
			// Warehouse position
			Warehouse w = new Warehouse();
			w.x = f.nextInt();
			w.y = f.nextInt();
			f.nextLine();
			for (int j = 0; j < productTypes; j++) {
				int quantity = f.nextInt();
				if (quantity != 0) {
					w.addItems(p.PRODUCT_TYPES.get(j), quantity);
				}
			}
			p.WAREHOUSES.add(w);
			f.nextLine();
		}

		// Number of orders
		int orderNumber = f.nextInt();

		f.nextLine();

		// Orders
		for (int i = 0; i < orderNumber; i++) {
			Order temp = new Order();
			temp.x = f.nextInt();
			temp.y = f.nextInt();
			f.nextLine();
			int productTypesOrderNumber = f.nextInt();
			f.nextLine();
			for(int j = 0; j < productTypesOrderNumber; j++){
				temp.addItems(p.PRODUCT_TYPES.get(f.nextInt()), 1);
			}
			p.ORDERS.add(temp);
		}

		f.close();
		
		for(int i = 0; i < drones; i++){
			Drone d = new Drone();
			d.x = p.WAREHOUSES.get(0).x;
			d.y = p.WAREHOUSES.get(0).y;
			p.DRONES.add(d);
		}
		
		return p;
	}
}
