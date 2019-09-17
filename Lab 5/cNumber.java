import java.util.*;
class Number {

private int n;

Number()
{
n=0;
}
Number(int n)
{
this.n=n;
}
public boolean isZero()
{
if(n==0) return true;
else return false;
}
public boolean isPositive()
{
if(n>0) return true;
else return false;
}
public boolean isNegative()
{
if(n<0) return true;
else return false;
}
public boolean isOdd()
{
if(n%2!=0) return true;
else return false;
}
public boolean isEven()
{
if(n%2==0) return true;
else return false;
}
public boolean isPrime()
{
int x,flag=1;
for(x=2;x<n;x++)
{
if(n%x==0) { flag=0;break;}
}
if(flag==1) return true;
else return false;


}

public boolean isArmstrong()
{
int d=0,temp,rem,sum=0;
temp=n;
while(temp!=0)
{
temp/=10;
d++;
}


int tempp=n;
while(tempp!=0)
{
rem=tempp%10;
sum+=Math.pow(rem,d);
tempp/=10;
}
if(sum==n) return true;
else return false;


}


}
public class cNumber {


	public static void main(String args[]) 
	{  
        
     Scanner sc=new Scanner(System.in);
Number mNumber=new Number();
int num,ch=0;
System.out.println("Input an number");
num=sc.nextInt();
mNumber=new Number(num);

System.out.println("List of methods : \n1. isZero()\n2. isPositive()\n3. isNegative()\n4. isOdd()\n5. isEven()\n6. isPrime()\n7. isArmstrong()\n8. Call ALL methods");
System.out.println("Enter choice (1-8) Press any other key to exit");
ch=sc.nextInt();
switch(ch) {
case 1:
System.out.println("isZero("+num+") returned "+mNumber.isZero());

break;

case 2:
System.out.println("isPositive("+num+") returned "+mNumber.isPositive());

break;

case 3:
System.out.println("isNegative("+num+") returned "+mNumber.isNegative());

break;

case 4:
System.out.println("isOdd("+num+") returned "+mNumber.isOdd());
break;

case 5:
System.out.println("isEven("+num+") returned "+mNumber.isEven());
break;

case 6:
System.out.println("isPrime("+num+") returned "+mNumber.isPrime());
break;

case 7:
System.out.println("isArmstrong("+num+") returned "+mNumber.isArmstrong());
break;

case 8:
System.out.println("isZero("+num+") returned "+mNumber.isZero());
System.out.println("isPositive("+num+") returned "+mNumber.isPositive());
System.out.println("isNegative("+num+") returned "+mNumber.isNegative());
System.out.println("isOdd("+num+") returned "+mNumber.isOdd());
System.out.println("isEven("+num+") returned "+mNumber.isEven());
System.out.println("isPrime("+num+") returned "+mNumber.isPrime());
System.out.println("isArmstrong("+num+") returned "+mNumber.isArmstrong());
break;
}




    
      
	}
}