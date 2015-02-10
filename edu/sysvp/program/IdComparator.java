package edu.sysvp.program;

import java.util.Comparator;
import tig058.handin01.member.Member;

public class IdComparator implements Comparator<Member>{
	public int compare(Member a, Member b){
		return a.getId() - b.getId();
	}
}
