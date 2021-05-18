package may6th2021;
abstract class University{
	void check() {
		System.out.println("Inside non Abstract method of Abstract class");
	}
	abstract void run();
}

public class AbstractClass extends University{
	void run() {
		System.out.println("Inside Abstract method of sub class");
	}
	public static void main(String[] args) {
		University u = new AbstractClass();
		u.run();
		u.check();
	}
}
