package april20th2021;
class Shape{
	String name;
	public Shape(){
		System.out.println("default constructor of shape class");
	}
	public Shape(String name) {
		this();
		this.name=name;
		System.out.println("Shape class parametraized constructor");
	}
	public void draw() {
		System.out.println("Can draw any type of shape");
	}
}
class Square extends Shape{
	int x;
	public Square(){
		System.out.println("Default constructor of square class");
	}
	public Square(int x) {
		super("MySquare");
		this.x=x;
		System.out.println("Square class parametarized construcor");
	}
	public void display() {
		System.out.println("It display squares");
	}
}
public class Q3 {
	public static void main(String[] args) {
		//Square sq = new Square();
		//sq.draw();
		//sq.display();
		// System.out.println(sq.x);
		Square sq1 = new Square(100);
		}

}
