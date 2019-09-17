import java.util.Scanner;

class Employee {

private float basicSalary,da,hra,total;
private String name;

public void getData(String name,float basicSalary, float da, float hra){
    this.name=name;
    this.basicSalary=basicSalary;
    this.da=da;
    this.hra=hra;
}

public void calculate() {


total=basicSalary+(basicSalary*da/100)+(basicSalary*hra/100);


}

public void display()
{
    System.out.println(name);
    System.out.println(total);
}


 


}
public class cEmployee {


    public static void main(String args[]) 
    {  
     String a;
     float b,c,d;   
     Scanner sc=new Scanner(System.in);
     System.out.println("Input the folllowing data\n1. Employee Name\n2.Basic Salary\n3.Dearness Allowance(DA)\n4.House Rent Allowance(HRA)");
     a=sc.nextLine();
     b=sc.nextFloat();
     c=sc.nextFloat();
    d=sc.nextFloat();
     Employee e=new Employee();
     e.getData(a,b,c,d);
     e.calculate();
     e.display();

     

      
    }
}