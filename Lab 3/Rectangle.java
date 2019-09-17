import java.util.Scanner;
public class Rectangle {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l,b;
         System.out.println("Enter the dimensions of the rectangle");
l=sc.nextInt();
b=sc.nextInt();
int p=2*(l+b);
      System.out.println("The area of the rectangle is "+l*b);
System.out.println("The perimeter of the rectangle is "+p);
    }
       
    
}
