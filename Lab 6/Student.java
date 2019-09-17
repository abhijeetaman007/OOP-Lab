import java.util.Scanner;

class studentBase {

	int regNo,age;
	String Name;

	studentBase()
	{
		regNo=0;
		Name="NULL";
        age=0;
	}
	studentBase(int regNo,String Name,int age) {
		this.regNo=regNo;
		this.Name=Name;
		this.age=age;
	}
	public void display() {

    	System.out.println("Registration Number : "+regNo);
    	System.out.println("Name : "+Name);
    	System.out.println("Age : "+age);
    	
    }
}

class UG extends studentBase {

	int sem=8,fees=100000;
	UG(int regNo,String Name,int age){
		super(regNo,Name,age);
      }

    public void display() {

    	super.display();
    	System.out.println("No. of semesters : "+sem);
    	System.out.println("FEES : "+fees);
    }
}
class PG extends studentBase {

	int sem=4,fees=250000;
	PG(int regNo,String Name,int age){
		super(regNo,Name,age);
      }

    public void display() {

    		UG(int regNo,String Name,int age){
		super(regNo,Name,age);
      }
    	System.out.println("No. of semesters : "+sem);
    	System.out.println("FEES : "+fees);
    }
}

public class Student {
	public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
int ch,regNo,age;
String name;
System.out.println("Create new student\n1. UG\n2. PG");
ch=sc.nextInt();
if(ch==1) {

	System.out.println("Input RegNo, Name and Age");
    regNo=sc.nextInt();
    sc.nextLine();
    name=sc.nextLine();
    age=sc.nextInt();
    UG mUG= new UG(regNo,name,age);
    mUG.display();

}
if(ch==2) {

	System.out.println("Input RegNo, Name and Age");
    regNo=sc.nextInt();
    sc.nextLine();
    name=sc.nextLine();
    age=sc.nextInt();
    PG mPG= new PG(regNo,name,age);
    mPG.display();

}


	}
}