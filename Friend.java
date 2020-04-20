
public class Friend extends Acquaintance{

	String homeTown;
	public Friend(String name,String homeTown) {
		// TODO Auto-generated constructor stub
		super(name);
		this.homeTown=homeTown;
	}
	public void getStatus()
	{
		System.out.println(name+" is a friend and he is from "+homeTown+".");
	}
}
