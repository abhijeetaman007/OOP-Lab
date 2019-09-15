import java.util.Scanner;

abstract class abstractArea {

abstract double Area(float s1, float s2, float s3);
abstract double Area(int s);
}

class calArea extends abstractArea {
	double area;
	calArea() {
		area=0;
	}
	double Area(float s1, float s2, float s3) {
		float s=(s1+s2+s3)/2;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return area;
	}
	double Area(int s) {
		area=s*s;
		return area;
	}
}

public class TriCir {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Area Calculator\n");
		System.out.println("1. Triangle\n2. Square");
		ch=sc.nextInt();
		switch(ch) {
			case 1 :
			int s1,s2,s3;
			calArea cal=new calArea();
			System.out.println("Input the sides of triangle");
			s1=sc.nextInt();
			s2=sc.nextInt();
			s3=sc.nextInt();
			System.out.println("Area of the triangle is "+cal.Area(s1,s2,s3));
			break;

			case 2 :
			int s;
			cal=new calArea();
			System.out.println("Input side of square");
			s=sc.nextInt();
			System.out.println("Area of the square is "+cal.Area(s));
			break;

			default : System.out.println("Invalid Choice");

		}
	}
} 