import java.util.Scanner;

class Complex {
private int r,i;
Complex()
{
r=0;
i=0;
}
Complex(int r, int i)
{
this.r=r;
this.i=i;
}
public void add(int in, Complex c)
{
r=in+c.r;
i=c.i;

}
public void add(Complex c1, Complex c2)
{
r=c1.r+c2.r;
i=c1.i+c2.i;

}
public void display()
{
System.out.println("The complex sum is "+r + "+" +i+"i");   
}




}
public class cComplex {


	public static void main(String args[]) 
	{  
Complex mComplex=new Complex();    

    
Scanner sc=new Scanner(System.in);
int ch;
System.out.println("Complex Addition::\n\n1. Integer+Complex\n2. Complex+Complex\n");
ch=sc.nextInt();
int i,real,imag;
switch(ch)
{
case 1 :
System.out.println("Input an integer");
i=sc.nextInt();
System.out.println("Input real and imaginary parts of the complex number");
real=sc.nextInt();
imag=sc.nextInt();
Complex c2=new Complex(real,imag);
mComplex.add(i,c2);
mComplex.display();
break; 

case 2:
System.out.println("Input real and imaginary parts of 1st complex number");
real=sc.nextInt();
imag=sc.nextInt();
Complex c1=new Complex(real,imag);
System.out.println("Input real and imaginary parts of 2nd complex number");
real=sc.nextInt();
imag=sc.nextInt();
c2=new Complex(real,imag);
mComplex.add(c1,c2);
mComplex.display();
} 
      
	}
}