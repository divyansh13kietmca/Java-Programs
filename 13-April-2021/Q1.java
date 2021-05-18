package april13th2021;

class Room{
	int roomNo;
	String roomType;
	int roomArea;
	String acMachine;

	public void setData(int roomNo, String roomType, int roomArea, String acMachine)
	{
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public void display() {
		System.out.println("\tRoomNo = "+roomNo);
		System.out.println("\tRoomType = "+roomType);
		System.out.println("\tRoomArea = "+roomArea);
		System.out.println("\tAC machine = "+acMachine);
	}
}
public class Q1 {
	public static void main(String[] args) 
	{
		Room rooms = new Room();
		rooms.setData(10,"4bhk",12,"Yes");
		System.out.println("\n");
		rooms.display();
		
		}
	}
