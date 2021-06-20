package may25th2021;

import java.util.Scanner;

class InvalidInput extends Exception
{
	String sentence;
	InvalidInput(String sen)
	{
		sentence = sen;
	}
	public String toString()
	{
		return "\nWrong Input "+sentence;
	}
}


class Customer{
	private String custNo;
	private String custName;
	private String category;
	
	
	Customer(String custNo, String custName, String category) throws InvalidInput
	{
		if ((custNo.charAt(0) == 'c') || (custNo.charAt(0) == 'C'))
		{
			this.custNo = custNo;
		}
		else
		{
			throw new InvalidInput("CustNo");
		}
		if(custName.length() >= 4)
		{
			this.custName = custName;
		}
		else
		{
			throw new InvalidInput("CustName");
		}
if((category.equalsIgnoreCase("Platinum")) || (category.equalsIgnoreCase("Gold")) ||(category.equalsIgnoreCase("Silver")))
		{		
			this.category = category;
		}
		else
		{
			throw new InvalidInput("CustCategory");
		}
		
	}
	public String getCustNo(){
		return custNo;
	}
	public String getCustName(){
		return custName;
	}
	public String getCustcategory(){
		return category;
	}

}
public class TestCustomer {
	public static void main(String[] args) throws InvalidInput {
		String number,name,category;
		Customer c;
		System.out.println("Enter details of the customer: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextLine();
		name = scan.nextLine();
		category = scan.nextLine();
		scan.close();
		c = new Customer(number,name,category);
		System.out.println(c);
		System.out.println(c.getCustNo());
		System.out.println(c.getCustName());
		System.out.println(c.getCustcategory());

	}

}
