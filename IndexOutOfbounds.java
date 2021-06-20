package may25th2021;
class Array
{
	int[] arr1 = new int[10];
	Array()
		{
			try
			{
				arr1[10] = 123;
				System.out.println(arr1[10]);
			}
	catch (ArrayIndexOutOfBoundsException ib)
	{
		System.out.println(ib.getMessage());
	}
		}
}
public class IndexOutOfbounds 
{
	public static void main(String[] args) 
	{
		Array a = new Array();
		
	}
}
