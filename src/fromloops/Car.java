package fromloops;

public class Car {
// constructor
	public Car(String string, String string2, int i, int j) {
		System.out.println("inside constructor");

}
	String colour;
	String model;
	int cost;
	int mileage;
// constructors simplify the process of initialisation or storing values
	public void Car1(String mdl, String clr,int cst,int mlg) {
		
		model = mdl;
		colour = clr;
		cost = cst;
		mileage = mlg;
	}

//method
public void startcar() {
	System.out.println("car started "+model);
}
	
	public void stopcar() {
		System.out.println("car stopped "+model);
		
	}
	public void cardetials() {
			System.out.println("Model of the car is "+model);
			System.out.println("colour of the car is   "+colour);
			System.out.println("cost of the car is  "+cost);
			System.out.println("Mileage of the car is  "+mileage);
		}		
}
