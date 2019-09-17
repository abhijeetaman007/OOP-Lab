import java.util.Scanner;

class CObject {
  static int counter;
CObject() 
{
	counter++;
}


 static void displayCount(){
System.out.println("No. of Object created so far is "+counter);
	}

 static void reset() {
 	counter=0;
 }



}

public class Objects {

	public static void main(String args[]) {
		int ch=1,k=0;
		CObject c[]=new CObject[100];
    Scanner sc=new Scanner(System.in);
    while(ch==1||ch==2||ch==3) {
    System.out.println("1. Create a new object\n2. Display Count\n3. Reset\n4. Exit");
    ch=sc.nextInt();
    
         switch(ch) {
         	case 1 : c[k++]=new CObject(); 
             System.out.println("\t\t\tObject creation Success!");
         	break;
         	case 2 : CObject.displayCount();break;
            case 3 : CObject.reset(); System.out.println("\t\t\tCount has been reset!");
         }
    }
	}
}

