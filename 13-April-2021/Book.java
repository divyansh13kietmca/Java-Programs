package april13th2021;

//import java.util.Scanner;

//Question
//1.Create a class Book which has following members:
//private int bookNo
//private String title
//private String author
//private float price
//Provide getter and setter methods for all the instance variables.
//Create a class BookDetails which has the main method. Create an object of the Book class. Initialize the object by reading inputs for the fields from the user.
//
//2. Modify the Book class to include a constructor for initializing the instance variables. Perform the below validations in the constructor and print appropriate error message if the validation fails.
//a. Title of the book must have atleast 4 characters
//b. price must be in the range 1 to 5000
//print the details of the book using displayData method..
//
//3. Modify the class to include the below static members
//private static int bookCount;
//public int static getBookCount( )
//Also write a Static block to initialize bookCount to zero.Increase the bookCount by 1 when a new Book object is created.

class BookDetails {
 private int bookNo;
 private String title;
 private String author;
 private float price;
 private static int bookCount;
  
	 public void setBookNo(int bookNo) {
		 this.bookNo = bookNo;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 public void setPrice(Float price) {
		 this.price = price;
	 }
	 public int getBookNo() {
		 return this.bookNo;
	 }
	 public String getTitle() {
		 return this.title;
	 }
	 public String getAuthor() {
		 return this.author;
	 }
	 public float getPrice() {
		 return this.price;
	 }

	 BookDetails(int bookNo, String title, String author, float price){
		 if((title).length() >= 4) 
		 {
				if ((1 <= price) && (price<= 5000))
				{
					 setBookNo(bookNo);
					 setTitle(title);
					 setAuthor(author);
					 setPrice(price);			
					System.out.print(getBookNo());
					System.out.print("\t"+getTitle());
					System.out.print("\t"+getAuthor());
					System.out.println("\t"+getPrice());
					 bookCount++;	
				}
				else 
				{
					System.out.println("Invalid Price: "+price);
				}
		 	 
		 }
		else
			 {
				 System.out.println("Invalid Book title: "+title);
			 }
	 }
	 
	 public static void BookCountInitialise() {
		 bookCount = 1;
	 }
	 public static int getBookCount() {
		 return bookCount;
	 }
	 public String toString() {
		 return "\n"+this.bookNo+"\t"+this.title+"\t"+this.author+"\t"+this.price+"\t"+bookCount;
	 }
}
public class Book{

	public static void main(String[] args) {
		
		BookDetails.BookCountInitialise();

		BookDetails b1 = new BookDetails(1,"Harry Potter","JK Rowling",2500);
		BookDetails b2 = new BookDetails(1,"Dum","Chetan Bhagat",2300); //wrong name
		BookDetails b3 = new BookDetails(1,"Quantative Aptitude","RS Aggarwal",6000); //wrong price

		System.out.print("\nBookNo."+"\tBook Title"+"\tBook Author"+"\tBook Price"+"\tBook Count");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
//		System.out.println("Enter the values for the book");
//		Scanner scan = new Scanner(System.in);
//		
//		int bookno = scan.nextInt();
//		b1.setBookNo(bookno);
//		String booktitle = scan.next();
//		b1.setTitle(booktitle);
//		String bookauthor = scan.next();
//		b1.setAuthor(bookauthor);
//		float bookprice = scan.nextFloat();
//		b1.setPrice(bookprice);	
		
	}
}