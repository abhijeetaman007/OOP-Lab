import java.util.Scanner;

public class sineSeries {

	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    double x,n;

	System.out.println("The sine series");
    System.out.println("Enter the values of x and n");
	
    x=sc.nextDouble();
    n=sc.nextDouble();

    double sum=0,i,j,power,mult=1,term;
    for(i=1;i<=n;i++)
    {
      power=(2*i)-1;
      double num= Math.pow(x,power);
      double denom=fact(power);
      term= (double)(mult*((num)/(denom)));
      sum+=term;
      mult*=-1;
    }

    System.out.println(sum);




	}

	public static double fact(double n) {
      
      double i,fact=1 ;
     for(i=n;i>=1;i--)
     	fact=fact*i;
     return fact;
     
	}
}