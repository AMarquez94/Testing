package p1;

import java.util.Comparator;

public class WeightComparator implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		if(arg0.WEIGHT < arg1.WEIGHT){
			return -1;
		}
		if(arg0.WEIGHT > arg1.WEIGHT){
			return 1;
		}
		return 0;
	}

}
