package p1;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		Problem p = null;
		p = Parser.parse("mother_of_all_warehouses.in");
		
		for(Order o : p.ORDERS){
			System.out.println("Order " + o.toString() + " : " + o.TOTALWEIGHT);
		}
		
		p.sortOrdersByLessWeight();
		System.out.println("================================");
		
		for(Order o : p.ORDERS){
			System.out.println("Order " + o.toString() + " : " + o.TOTALWEIGHT);
		}
		
		System.out.println("===============");
		System.out.println("===============");
		
		int total = 0;
		int num = 0;
		for(Order o : p.ORDERS){
			total += o.TOTALWEIGHT;
			num++;
		}
		
		System.out.println((double)total/(double) num);
		
		System.out.println("===============");
		System.out.println("===============");
		
		Order temp = p.ORDERS.get(500);
		for(Product o : temp.PLAIN_ORDER){
			System.out.println("Product " + o.toString() + " : " + o.WEIGHT);
		}
		
		temp.sortProductsByLessWeight();
		System.out.println("===============");
		
		for(Product o : temp.PLAIN_ORDER){
			System.out.println("Product " + o.toString() + " : " + o.WEIGHT);
		}
	}
}
