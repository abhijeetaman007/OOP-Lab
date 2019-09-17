import java.util.Scanner;

class leapYear{
public static void main(String args[])
 { 
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year");
year=sc.nextInt();
if(year%4!=0) System.out.println("Common year");
else if(year%100!=0) System.out.println("Leap Year");
else if(year%400!=0) System.out.println("Common Year");
else System.out.println("Leap Year");
 
  

 }


}