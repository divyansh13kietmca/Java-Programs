package uploads;

class Colleges 
{
	protected String clg_name = "Kiet";
	
	Colleges(){
		System.out.println("\nName of College = "+clg_name);
	
	}
}
class Students extends Colleges{
	String name;
	
	Students(String name)
	{
		this.name = name;
		System.out.println("Name of the Student = "+name);
	}
}

class Teachers extends Colleges{
	static String name;
	
	Teachers(String name){
		Set_name(name);
		System.out.println("Name of the teacher = "+Teachers.name);
	}
	public static void Set_name(String name) {
		Teachers.name = name;
	}
}
public class LabAssignment5_Hierarchial {

	public static void main(String[] args) {
		
		Students s1 = new Students("Divyansh");
		Teachers t1 = new Teachers("RS Aggarwal");
		
	}
}
