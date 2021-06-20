package may25th2021;

public class ThrownException {
	
	public static void Display(String name)
	{
		if(name != "divyansh")
		{
			throw new IllegalArgumentException();
				
		}
		else
		{
		System.out.println("My Name = "+name);
		}
	}
	public static void main(String[] args) {
		try
		{
			Display("arpit");
		}
		catch (IllegalArgumentException a)
		{
			System.out.println("Wrong name");
		}
	}
}
