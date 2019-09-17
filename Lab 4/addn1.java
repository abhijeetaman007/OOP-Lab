import java.util.Scanner;
public class addn1{
	
	public static void main(String args[]) {
       
   int[] a=new int[100];
   int n,i,j,flag;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of the array");
   n=sc.nextInt();
   System.out.println("Input elements");
   for(i=0;i<n;i++) a[i]=sc.nextInt();
   System.out.println("The entered array is :");
   for(i=0;i<n;i++) System.out.print(a[i]+"\t");
   	System.out.print("\n");
   
    i=0;
    while(i<n) {
        flag=0; 
    	for(j=2;j<a[i];j++){
    		if(a[i]%j==0) {flag=1;break;}
    	}
    	if(flag==0&&a[i]!=1) System.out.print(a[i]+"\t");
    	i++;

    }


     System.out.print("are the prime numbers\n");
   	}

	
	
}