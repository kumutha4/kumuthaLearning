
public class BestFriend extends Friend{

	String favoriteSong;
	public BestFriend(String name,String homeTown,String favoriteSong) {
		// TODO Auto-generated constructor stub
		super(name,homeTown);
		this.favoriteSong=favoriteSong;
	}
	public void getStatus()
	{
		System.out.println(name+" is my best friend. He is from "+homeTown+" and his favorite song is "+favoriteSong+".");
	}
}
