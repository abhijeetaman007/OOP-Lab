import java.util.Scanner;

class Time {
private int hh,mm,ss;
Time()
{
hh=0;
mm=0;
ss=0;
}
Time(int hh,int mm,int ss)
{
this.hh=hh;
this.mm=mm;
this.ss=ss;
}
public void display()
{
if(hh/10==0) System.out.print("0"+hh+":");
else System.out.print(hh+":");
if(mm/10==0) System.out.print("0"+mm+":");
else System.out.print(mm+":");
if(ss/10==0) System.out.print("0"+ss);
else System.out.print(ss);
}

public void addTime(Time t,Time u)
{
ss=(t.hh+u.hh)*3600 + (t.mm+u.mm)*60 + (t.ss+u.ss);
mm = ss/60;
ss = ss % 60;
hh = mm/60;
mm = mm % 60;


}

}
public class cTime {


    public static void main(String args[]) 
    {  
    int h,m,s; 
    Scanner sc=new Scanner(System.in);
    Time t=new Time();
System.out.println("Time Class constructed with initial values\n");
    System.out.println("Input time1 (hours,minutes,seconds)"); 
    h=sc.nextInt();
    m=sc.nextInt();
    s=sc.nextInt();
    t=new Time(h,m,s);
System.out.println("Input time2 (hours,minutes,seconds)"); 
    h=sc.nextInt();
    m=sc.nextInt();
    s=sc.nextInt();
Time u=new Time(h,m,s);
    Time add=new Time();
    add.addTime(t,u);
    add.display();

      
    }
}