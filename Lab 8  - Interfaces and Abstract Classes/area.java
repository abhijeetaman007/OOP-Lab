import java.util.Scanner;

abstract class abstractArea {

abstract float Area(int l, int b);
abstract float Area(int r);
}

class calArea extends abstractArea {
	float area;
	calArea() {
		area=0;
	}
	float Area(int l, int b) {
        area = l*b;
        return area;
	}
	float Area(int r) {
		area=(float)3.14*r*r;
		return area;
	}
}

public class area {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Area Calculator\n");
		System.out.println("1. Rectangle\n2. Circle");
		ch=sc.nextInt();
		switch(ch) {
			case 1 :
			int l,b;
			calArea cal=new calArea();
			System.out.println("Input dimensions of the rectangle");
			l=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Area of the rectangle is "+cal.Area(l,b));
			break;

			case 2 :
			int r;
			cal=new calArea();
			System.out.println("Input the radius of the circle");
			r=sc.nextInt();
			System.out.println("Area of the circle is "+cal.Area(r));
			break;

			default : System.out.println("Invalid Choice");

		}
	}
} 