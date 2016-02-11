package p1;

public class Algorithms {

	
	public static void aParisQueVamos(Problem p){
		
		// Bucle principal de turnos
		for(int i = 0; i<p.MAXTURNS; i++){
			
			// Para cada drone
			for(int j = 0; j<p.DRONES.size(); j++){
				Drone dronActual = p.DRONES.get(j);
				
				if(!dronActual.ocupado){
					dronActual.order = p.ORDERS.get(0);
					p.ORDERS.remove(0);
					dronActual.load(i,p.WAREHOUSES.get(0));
				}
			}
		}
		
	}
}
