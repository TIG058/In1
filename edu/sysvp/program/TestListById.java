package edu.sysvp.program;

import java.util.ArrayList;
import java.util.Collections;
import tig058.handin01.registry.ClubRegistry;
import tig058.handin01.member.Member;
import tig058.handin01.member.MemberAlphaComparator;
import tig058.handin01.member.MemberAlphaFirstnameComparator;
import tig058.handin01.log.Logger;
import java.io.Console;

public class TestListById{

	public static void main(String[] args){
		ClubHelper ch = new ClubHelper();
		ch.printMembersById();
	}
}