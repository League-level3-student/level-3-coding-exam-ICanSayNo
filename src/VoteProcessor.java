import java.util.ArrayList;
import java.util.Iterator;

public class VoteProcessor {
	
	String calculateElectionWinner(ArrayList<String> votes){
		int winner = 0;
		for (String a : votes) {
			if(a.toLowerCase().equals("edward snowden")) {
				winner+=1;
			}
			if(a.toLowerCase().equals("pope francis")) {
				winner-=1;
			}
		}
		if(winner >= 1) {
			return "edward snowden";
		}
		else if(winner <= -1) {
			return "pope francis";
		}
		else {
			return "TIE";
		}
	}
	
}
