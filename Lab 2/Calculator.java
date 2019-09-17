import java.util.Scanner;

public class Calculator{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a,b;
char ch='y';
char op;
while(ch=='y'||ch=='Y'){

System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Input an operator (+ (or) - (or) * (or) /)");
op=sc.next().charAt(0);
switch(op) {
case '+' : System.out.println(a+"+"+b+" is "+(a+b)); break;
case '-' : System.out.println(a+"-"+b+" is "+(a-b)); break;
case '*' : System.out.println(a+"*"+b+" is "+(a*b)); break;
case '/' : System.out.println(a+"/"+b+" is "+((float)a/b)); break;
default :  System.out.println("Enter a valid operator, Press Y to continue");
}
System.out.println("Continue (Y/N)");
ch=sc.next().charAt(0);
}
}
}