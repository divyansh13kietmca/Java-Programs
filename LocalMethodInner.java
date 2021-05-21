package may20th2021;
class Year
{
	public void localclass()
	{
		class TwentyTwentyone
		{
			public void display()
			{
				System.out.println("Year 2021");
			}
		}
		TwentyTwentyone t = new TwentyTwentyone();
		t.display();
	}
}
public class LocalMethodInner {
	public static void main(String[] args) {
		Year y = new Year();
		y.localclass();
	}
}
