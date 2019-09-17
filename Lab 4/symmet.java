import java.util.Scanner;

public class symmet {


	public static void main(String args[]) 
	{   Scanner sc= new Scanner(System.in);
		int a[][]=new int[10][10];
        int n,i,j;
	    System.out.println("Enter the dimension of the matrix");
        n=sc.nextInt();
        System.out.println("Input elements row wise");
        for(i=0;i<n;i++){
          for(j=0;j<n;j++) 
                a[i][j]=sc.nextInt();
        }
        System.out.println("The entered matrix is ::");
        for(i=0;i<n;i++){
          for(j=0;j<n;j++) 
                System.out.print(a[i][j] + "\t");
                System.out.println("");
 }

int flag=0;
for(i=0;i<n;i++)
{

for(j=0;j<n;j++) {
if(a[i][j]!=a[j][i]) {flag=1;break;}
}
}
if(flag==0)
System.out.println("SYMMETRIC");
else 
System.out.println("NOT SYMMETRIC");
        
     
      
	}
}