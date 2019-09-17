import java.util.Scanner;
public class addn5{
	
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

  int trace=0,sum=0;
  double norm;
  for(i=0;i<r;i++)
   {
   	for(j=0;j<c;j++) {
        sum+=a[i][j]*a[i][j];
   		if(i==j) trace+=a[i][j]; }
   }
   norm=Math.sqrt(sum);

   System.out.println("The trace and norm of the entered matrix are "+trace+" and "+norm+" respectively");





   	}

	
	
}