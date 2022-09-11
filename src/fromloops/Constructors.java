package fromloops;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Constructor calling!!.create an object for the car class and car 
//class is automatically called. Methods are manually called.To simplify the
		// initialisation of variables.eg int a =5
		
		Car bmw = new Car("B class","black",2000000,20);
		Car audi =new Car ("super class","blue",4000000,16);
		Car volvo = new Car("swedish class", "white", 9000000, 0);
		
	//	Initialising
		bmw.model ="B class";
		bmw.colour ="black";
		bmw.cost =2000000;
		bmw.mileage = 20;
		
		System.out.println("...........");
		
		audi.model ="super class";
		audi.colour ="blue";
		audi.cost =4000000;
		audi.mileage = 16;
		
		System.out.println("...........");
		
		volvo.model ="swedish class";
		volvo.colour ="white";
		volvo.cost =9000000;
		volvo.mileage = 0;
		// call methods
		bmw.startcar();
		bmw.stopcar();
		bmw.cardetials();
		System.out.println("...........");
		
		audi.startcar();
		audi.stopcar();
		audi.cardetials();
		System.out.println("...........");
		
		volvo.startcar();
		volvo.stopcar();
		volvo.cardetials();
		System.out.println("...........");
	}
	
	}


