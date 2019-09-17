import java.util.Scanner;
public class addn2{
	
	public static void main(String args[]) {
       
   int[] a=new int[100];
   int n,i,big,small;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of the array");
   n=sc.nextInt();
   System.out.println("Input elements");
   for(i=0;i<n;i++) a[i]=sc.nextInt();
   System.out.println("The entered array is :");
   for(i=0;i<n;i++) System.out.print(a[i]+"\t");
   	System.out.print("\n");
   small=big=a[0];
   for(i=1;i<n;i++){
   	if(a[i]>big) big=a[i];
   	if(a[i]<small) small=a[i];
   }

   System.out.println("The smallest number is "+small+"\nThe largest number is "+big+"\n");
 
   	}

	
	
}