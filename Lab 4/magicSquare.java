import java.util.Scanner;

public class magicSquare{
	
	public static void main(String args[])
	{    
	    Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		int n,i,j;
		System.out.println("Enter the dimensions of the matrix");
		n=sc.nextInt();
		System.out.println("Input elements row-wise");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The entered matrix is :");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) 
				System.out.print(a[i][j]+"\t");
			System.out.print("\n");
		}
		
		int magic[]=new int[25];
		int rsum,csum,pdsum=0,npdsum=0,k=0;
		for(i=0;i<n;i++)
		{   rsum=0;
			for(j=0;j<n;j++) {
				rsum+=a[i][j];
			}
			magic[k++]=rsum;
		}
		for(i=0;i<n;i++)
		{
			csum=0;
			for(j=0;j<n;j++) {
				csum+=a[j][i];
			}
			magic[k++]=csum;
		}
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<n;j++) {
				if(i==j) pdsum+=a[i][j];
			}
			
		}
		magic[k++]=pdsum;
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<n;j++) {
				if(j==n-i-1) npdsum+=a[i][j];
			}
			
		}
		magic[k++]=npdsum;
		
		
		int flag=0,key=magic[0];
		for(i=1;magic[i]!='\0';i++)
		{
			if(magic[i]!=key) {flag=1;break;}
			
		}
		if(flag==0) System.out.println("The entered matrix is a MAGIC SQUARE");
		else System.out.println("The entered matrix is  NOT A MAGIC SQUARE");
		
		
		
		
		
	}
	
}