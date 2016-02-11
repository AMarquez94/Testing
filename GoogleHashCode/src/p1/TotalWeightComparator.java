package p1;

import java.util.Comparator;

public class TotalWeightComparator implements Comparator<Order>{

	@Override
	public int compare(Order arg0, Order arg1) {
		if(arg0.TOTALWEIGHT < arg1.TOTALWEIGHT){
			return -1;
		}
		if(arg0.TOTALWEIGHT > arg1.TOTALWEIGHT){
			return 1;
		}
		return 0;
	}

}
