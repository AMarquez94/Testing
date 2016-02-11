package p1;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		Problem p = null;
		p = Parser.parse("mother_of_all_warehouses.in");
		System.out.println(p.toString());
	}
}
