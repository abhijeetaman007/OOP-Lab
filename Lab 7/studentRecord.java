import java.util.Scanner;

class StudentDetail {
    static String collegeName="Manipal Institute of Technology";
	int id;
	String studentName;
StudentDetail(int id, String studentName) {
	this.id=id;
	this.studentName=studentName;
}

void displayDetails(){
	System.out.println("\t\t\tName of the Student : "+studentName);
	System.out.println("\t\t\tID : "+id);
	System.out.println("\t\t\tName of the College : "+collegeName+"\n");
}



}

public class studentRecord {

	public static void main(String args[]) {
		int i,ch=1,id,k=0;
		char choice='y';
        String name;
		Scanner sc=new Scanner(System.in);
		StudentDetail sd[] = new StudentDetail[10];
		
			System.out.println("\t\tManipal Institute of Technology :: Student Records");
		while(ch==1||ch==2) {
		System.out.println("1. Input Student Data\n2. Display Student Data\n\n Press any other number to exit");
        ch=sc.nextInt();

        switch(ch) {
        	case 1 : System.out.println("Enter ID and Name");
        	id=sc.nextInt();
        	sc.nextLine();
        	name=sc.nextLine();
            sd[k++]=new StudentDetail(id,name);
            System.out.println("Data entry successful!");
            break;

            case 2 : for(i=0;i<k;i++) sd[i].displayDetails(); break;

            
        } 
       
    }
	}
}

