import java.util.Scanner;

class BoxUnbox {
  
void display(int in) {
    System.out.println("Auto-Unboxing");
    System.out.println("Inside display() Function : Entered value is "+in);
}

}

public class qBoxUnbox {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    BoxUnbox b=new BoxUnbox();
     int j;
    System.out.println("Input an integer");
    j=sc.nextInt();
    Integer i=j;
    System.out.println("Auto-Boxing Integer");
    b.display(i);
   
	}
}