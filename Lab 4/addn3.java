import java.util.Scanner;
public class addn3{
	
	public static void main(String args[]) {
       
   Scanner sc=new Scanner(System.in);    
   int[][] a=new int[10][10];
   int r,c,i,j,k;
   System.out.println("Enter the dimensions of the matrix");
   r=sc.nextInt();
   c=sc.nextInt();
   System.out.println("Input elements row wise");
   for(i=0;i<r;i++)
   {
   	for(j=0;j<c;j++)
   		a[i][j]=sc.nextInt();
   }
   System.out.println("THe entered matrix is :");
   for(i=0;i<r;i++)
   {
   	for(j=0;j<c;j++)
   		System.out.print(a[i][j]+"\t");
   	    System.out.print("\n");
   }

   System.out.println("Enter the key to be searched");
   k=sc.nextInt();
   int count=0;
    for(i=0;i<r;i++)
   {
   	for(j=0;j<c;j++)
   		if(a[i][j]==k) count++;
   }   
if(count==0)
	System.out.println(k + " NOT FOUND!!");
else 
	System.out.println("No. of occurences of "+k+" is "+count);


   	}

	
	
}