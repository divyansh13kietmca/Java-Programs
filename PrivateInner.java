package may20th2021;
class Grocery
{
	private class Fruits
	{
		public void print()
		{
			System.out.println("Inside Private class Fruits: ");
		}
	}
	public void FruitsMethod()
	{
		Fruits f = new Fruits();
		f.print();
	}
}
public class PrivateInner {
	public static void main(String[] args) {
		Grocery  g = new Grocery();
		g.FruitsMethod();  
	}
}
