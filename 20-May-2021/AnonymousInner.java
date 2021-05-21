package may20th2021;
abstract class Hidden
{
	abstract void display();
	public void show()
	{
		System.out.println("Inside the normal method 0(show)0");
	}
}
public class AnonymousInner {
	public static void main(String[] args) 
	{
		Hidden h = new Hidden() 
		{
			public void display() 
			{
				System.out.println("Inside the abstract class method");
			}
	
		};
		h.show();
		h.display();
	}
}
