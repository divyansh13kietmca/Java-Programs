package may4th2021;
class Wholesale{
	public void grocery(){
		System.out.println("Inside the Wholesale Shop");
	}
}
class Shop extends Wholesale{
	public void grocery() {
		System.out.println("Inside the normal shop");
	}
}
public class MethodOverriding {
public static void main(String[] args) {
	System.out.println();
	Shop cus = new Shop();
	cus.grocery();
	
//	Wholesale cus1 = new Shop(); //upcasting
//	cus1.grocery();
//	
//	Shop cus2 = (Shop) cus1;
//	cus2.grocery();

}
}
