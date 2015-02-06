package edu.sysvp.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.text.*;
import java.io.*;

import tig058.handin01.registry.ClubRegistry;
import tig058.handin01.member.Member;
import tig058.handin01.member.MemberAlphaComparator;
import tig058.handin01.member.MemberAlphaFirstnameComparator;
import tig058.handin01.log.Logger;

public class ClubMain {

    public static void printProp(String s, String prop) {
	String propValue = System.getProperty(prop);
	if (propValue!=null) {
	    System.out.println(s + propValue );
	}
    }

    public static void main(String[] args) {
    Date d=new Date(); // nytt
	System.out.println(" -----===< Club Manager >===-----");
	System.out.println("  Date:       "+ d); // nytt
	printProp("  User:       ", "user.name");
	printProp("  OS arch:    ", "os.arch");
	printProp("  OS name:    ", "os.name");
	printProp("  OS version: ", "os.version");
	System.out.println(" -----=====================-----");
	System.out.println("");
	 // nytt

	ClubHelper c= new ClubHelper(); // Peter
	Menu m=new Menu(c); // Mitt
	m.run(); // Mitt

	//	Logger.setDebugLevel();

	ClubHelper ch = new ClubHelper();
	//	System.out.println("Should be a menu here");
	
	  // System.out.println(" ... let's assume user wanted to print teams");
	  // ch.printTeams();
	  //   System.out.println(" ... let's assume user wanted to print members");
	  // ch.printMembers();
	  /*
	    System.out.println(" ... let's assume user wanted to print members in alpha order");
	    ch.printMembersAlpha();
	  System.out.println(" ... let's assume user wanted to print members in alpha order on given name");
	  ch.printMembersAlphaFirstName();
	*/
	
	
	/*
	ArrayList<Member> members = cm.cr.getMembers();
	System.out.println(" ... size: " + members.size());
	members.remove(10);
	System.out.println(" ... size: " + members.size());
	cm.cr.storeMembers();
	*/

	ch.printMembers("%Karl%");
	ch.printTeams();

	ch.printTeamMembers("F01");
	ch.printTeamMembers("D");
	ch.printParents(1016);
	ch.printParents(1017);

	ch.emailMember(1010);
	ch.emailMember(1016);
	ch.emailMember(1017);
	ch.emailMember(1018);
    }

}
