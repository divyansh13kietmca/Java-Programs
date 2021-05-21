package may20th2021;
class Employee
{
	String name;
	Employee(String name)
	{
		this.name = name;
		System.out.println("Name of employee = "+name);
	}
}
class Manager implements Cloneable{
	String name;
	Manager(String name)
	{	this.name = name;
		Employee emp = new Employee(name);
	}
	public void display()
	{
		System.out.println("Name = "+name);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Manager ob2 = new Manager("amit"); 
		Manager ob1 = (Manager)ob2.clone();
		ob1.name = "Rohit";
		ob1.display();
		ob2.display();
	}
}
