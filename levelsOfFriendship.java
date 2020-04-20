import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class levelsOfFriendship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in= new Scanner(System.in);
	int noOfFriends=in.nextInt();
	List<String> peoplelist=new ArrayList<String>();
	for(int i=0;i<(noOfFriends+1);i++)
	{
		String people=in.nextLine();
		
		peoplelist.add(people);
		
	}
	for (String people : peoplelist) 
	{
		String[] peopleDetails=people.split(" ");
		if(peopleDetails[0].equalsIgnoreCase("Acquaintance"))
		{
			Acquaintance aq=new Acquaintance(peopleDetails[1]);
			aq.getStatus();
		}
		else if(peopleDetails[0].equalsIgnoreCase("Friend"))
		{
			Friend frd=new Friend(peopleDetails[1], peopleDetails[2]);
			frd.getStatus();
		}
		else if(peopleDetails[0].equalsIgnoreCase("BestFriend"))
		{
			BestFriend bst=new BestFriend(peopleDetails[1], peopleDetails[2],peopleDetails[3]);
			bst.getStatus();
		}
		}
	}

}
