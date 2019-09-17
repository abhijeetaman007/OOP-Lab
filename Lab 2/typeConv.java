import java.util.Scanner;

public class typeConv{

public static void main(String args[]){
int numInt;
double numDouble;
char ch;
Scanner sc=new Scanner(System.in);

System.out.println("Enter an integer, a double number and a character");
numInt=sc.nextInt();
numDouble=sc.nextDouble();
ch=sc.next().charAt(0);
System.out.println("Integer to byte: "+(byte)numInt);
System.out.println("Character to Integer: "+(int)ch);
System.out.println("Double to Byte: "+(byte)numDouble);
System.out.println("Double to Integer: "+(int)numDouble);


}
}