import java.util.Scanner;

public class resultCheck{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int a,b;

a=sc.nextInt();
b=sc.nextInt();

System.out.println((a<<2)+(b>>2));

System.out.println(b>0);
System.out.println((a+b*100)/10);
System.out.println(a&b);

}
}