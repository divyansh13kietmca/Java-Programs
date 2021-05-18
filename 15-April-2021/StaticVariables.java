package april15th2021;

class Students{
	String name;
	static int count = 0; //STATIC VARIABLES
	static int studobj;
	static int classNum = 1;
	
	static{ 	//STATIC BLOCK
		studobj = 1;
		System.out.println("\tObject Number = "+studobj+"\n");
	}
	
	public void setName(String name) {
		 this.name = name;
		 Students.count++;
		 Students.setClass();
		 
	}
	public static void setClass() { //STATIC METHOD
		if (Students.count > 3) {
			Students.classNum = 2;
		}
			
	}
	void display() {
		 System.out.print("Roll No. = "+Students.count);
		 System.out.print("\tName = "+this.name);
		 System.out.println("\tClassNum = "+Students.classNum);
	}
}
public class StaticVariables {
public static void main(String[] args) {
	Students s1 = new Students();
	Students s2 = new Students();
	Students s3 = new Students();
	Students s4 = new Students();
	
	s1.setName("Amit Kumar");
	s1.display();
	s2.setName("Aman");
	s2.display();
	s3.setName("Divyansh");
	s3.display();
	s4.setName("Chirag");
	s4.display();

	}
}
