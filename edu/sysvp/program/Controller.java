import java.util.*;

public class Controller{


	
	public static void main(String [] args){
		System.out.println("Members:");
		for (Member m: members) {
	    System.out.println(m);

	}	
	}
		//Menyalternativ 3, sortera på efternamn
		
	public static void printMembersId() {
		Logger.debugM();
		ArrayList<Member> members = cr.getMembers();
		Collections.sort(members, new MemberIdComparator());

	System.out.println("Members:");
	for (Member m: members) {
	    System.out.println(m);
	}
    }
}
