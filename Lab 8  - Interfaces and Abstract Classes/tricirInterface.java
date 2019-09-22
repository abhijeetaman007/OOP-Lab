import java.util.Scanner;

interface interfaceArea {
	float Area(float s1, float s2, float s3);
	float Area(float s); 
}

class calArea implements interfaceArea {

	float area;
	public float Area(float s1, float s2, float s3) {
		float s=(s1+s2+s3)/2;
        area=(float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return area;
	}
	public float Area(float r){
		area=(r*r);
		return area;
	}
}

public class tricirInterface {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Area Calculator\n");
		System.out.println("1. Triangle\n2. Square");
		ch=sc.nextInt();
		switch(ch) {
			case 1 :
			int s,s1,s2,s3;
			calArea cal=new calArea();
			System.out.println("Input dimensions of the triangle");
			s1=sc.nextInt();
			s2=sc.nextInt();
			s3=sc.nextInt();
			System.out.println("Area of the triangle is "+cal.Area(s1,s2,s3));
			break;

			case 2 :
			
			cal=new calArea();
			System.out.println("Input side length of the square");
			s=sc.nextInt();
			System.out.println("Area of the square is "+cal.Area(s));
			break;

			default : System.out.println("Invalid Choice");
	}
}
}
