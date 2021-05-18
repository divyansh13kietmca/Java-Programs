package may6th2021;

interface Car{
	void runCar();
	
	default public void showCar() {
		System.out.println("Inside Car interface");
	}
}
interface Bike{
	void runBike();
	default public void showBike() {
		System.out.println("Inside Bike interface");
	}
}

public class InterfaceJava implements Car,Bike{
	public void runCar() {
		System.out.println("Car is running");
	}
	public void runBike() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		InterfaceJava i = new InterfaceJava();
		i.showCar();
		i.runCar();
		System.out.println();
		i.showBike();
		i.runBike();
	}
}
