import java.util.Scanner;
class Number {

	public int a,b;

	Number(int a,int b) {
		this.a=a;
		this.b=b;
`
	}

    
	public void swap(Number n) {

		int c;
		c=n.a;
		n.a=n.b;
		n.b=c;
	}
}




public class addn3 {

public static void main(String args[]) {

    int a,b;
	Scanner sc=new Scanner(System.in);

	System.out.println("main() : Input the values for a and b");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("main() : The values of a and b before swapping are\na="+a+"\nb="+b);
	swap(a,b);
	System.out.println("main() : The values of a and b after swapping are\na="+a+"\nb="+b);

	Number nums=new Number(a,b);
	nums.swap(nums);
	System.out.println()
	System.out.println("main() : The values of a and b after swapping are\na="+nums.a+"\nb="+nums.b);
}

public static void swap(int a,int b) {
	System.out.println("swap() : Invoked swap() by values...");
 int temp;
 temp=a;
 a=b;
 b=temp;
 System.out.println("swap() : The values of a and b are\na="+a+"\nb="+b);

}


}


