import java.util.Scanner;

interface sports {
	void getNumberOfGoals(int t1, int t2);
	void dispTeam();
}

class Hockey implements sports {
	int t1, t2;
	public void getNumberOfGoals(int t1, int t2) {
		this.t1=t1;
		this.t2=t2;
	}

	public void dispTeam() {
		System.out.println(" Team 1 : "+t1);
		System.out.println(" Team 2 : "+t2);
		if(t1>t2) System.out.println(" Team 1 wins!");
		else if(t1<t2) System.out.println(" Team 2 wins!");
		else System.out.println("TIE!");
	}
}
class Football implements sports {
	int t1, t2;
	public void getNumberOfGoals(int t1, int t2) {
		this.t1=t1;
		this.t2=t2;
	}

	public void dispTeam() {
		System.out.println(" Team 1 : "+t1);
		System.out.println(" Team 2 : "+t2);
		if(t1>t2) System.out.println(" Team 1 wins!");
		else if(t1<t2) System.out.println(" Team 2 wins!");
		else System.out.println("TIE!");
	}
}

public class addn3 {
	public static void main(String args[]) {
		int t1,t2;
		sports h=new Hockey();
		sports f=new Football(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("HOCKEY\n Enter no of goals for two teams");
		t1=sc.nextInt();
		t2=sc.nextInt();
		h.getNumberOfGoals(t1,t2);
		System.out.println("FOOTBALL\n Enter no of goals for two teams");
		t1=sc.nextInt();
		t2=sc.nextInt();
		f.getNumberOfGoals(t1,t2);
		System.out.println("HOCKEY RESULTS");
		h.dispTeam();
		System.out.println("FOOTBALL RESULTS");
		f.dispTeam();


	}
}