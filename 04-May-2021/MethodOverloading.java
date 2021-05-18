package may4th2021;
class Shape{
	public void area() {
		System.out.println("Normal Method");
	}
	public void area(int side) {
		System.out.println("Area of square = "+side*side);
	}
}
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		System.out.println();
		s1.area();
		s1.area(5);
	}
}
