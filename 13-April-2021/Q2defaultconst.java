package april13th2021;

public class Q2defaultconst {
	int number;
	String name;
	
	public Q2defaultconst() {
		number = 1;
		name = "hello";
	}
	Q2defaultconst(int number, String name){
		this.number = number;
		this.name = name;
	}
	Q2defaultconst(Q2defaultconst n){
		this();
		this.number = n.number;
		this.name = n.name;
	}
	void display() {
		System.out.println("\t\tNumber = "+number);
		System.out.println("\t\tName = "+name);
	}
	public static void main(String[] args) {
		Q2defaultconst cons = new Q2defaultconst();
		Q2defaultconst para = new Q2defaultconst(2,"new");
		Q2defaultconst copy = new Q2defaultconst(cons);
		System.out.println("\n");
		System.out.println("\t\t Using Default Constructor");
		cons.display();
		System.out.println("\t\t Using Parameterised Constructor");
		para.display();
		System.out.println("\t\t Using Copy Constructor");
		copy.display();
	}
}
