package april20th2021;

class Shape{
	int x;
	public Shape(){
		System.out.println("default constructor of shape class");
	}
	public void draw() {
		System.out.println("Can draw any type of shape");
	}
}
class Square extends Shape{
	public Square(){
		System.out.println("Default constructor of square class");
	}
	public void display() {
		System.out.println("It display squares");
	}
}

public class Q1 { //inheritance demo
	 public static void main(String[] args) {
		 Square sq = new Square();
		 sq.draw();
		 sq.display();
		 // System.out.println(sq.x);

		  }

}
