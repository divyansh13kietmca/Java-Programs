package may20th2021;
class School
{
	static class Student
	{
		public void display()
			{
			System.out.println("Inside the student class");
		}
	}
}
public class StaticInner {
	public static void main(String[] args) 
	{
		School.Student s = new School.Student();
		s.display();
	}
}
