import java.util.Scanner;

public class ternary{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter 3 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

int large=(a>b)?(a>c)?a:c:(b>c)?b:c;
System.out.println("The largest number is "+large);


}
}