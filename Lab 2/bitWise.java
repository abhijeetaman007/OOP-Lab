import java.util.Scanner;

public class bitWise{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num,prod,quo;
System.out.println("Enter a number");
num=sc.nextInt();
prod=num<<1;
quo=num>>1;
System.out.println(num+"*2 is "+prod);
System.out.println(num+"/2 is "+quo);



}
}