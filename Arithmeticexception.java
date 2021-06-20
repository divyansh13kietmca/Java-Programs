package may25th2021;

public class Arithmeticexception {
	public static void DivisionByThree(int number) throws ArithmeticException
	{
		System.out.println(3/number);
	}
	public static void main(String[] args) {
		try
			{
					Arithmeticexception.DivisionByThree(0);
			}
		catch (ArithmeticException ae)
			{
					System.out.println(ae.getMessage());
			}
	}
}
