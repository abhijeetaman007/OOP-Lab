import java.util.Scanner;
public class addn4{
	
	public static void main(String args[]) {
       
   int[] a=new int[100];
   int[] b=new int[100];
   int[] c=new int[200];
   int m,n,i,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of the first array");
   m=sc.nextInt();
   System.out.println("Input elements");
   for(i=0;i<m;i++) a[i]=sc.nextInt();
    System.out.println("Enter the size of the second array");
   n=sc.nextInt();
   System.out.println("Input elements");
   for(i=0;i<n;i++) b[i]=sc.nextInt();


   System.out.println("The entered arrays are :");
   for(i=0;i<n;i++) System.out.print(a[i]+"\t");
   	System.out.print("\n");
   for(i=0;i<n;i++) System.out.print(b[i]+"\t");
    System.out.print("\n");
  
   for(i=0;i<m;i++)
   c[i]=a[i];
 int k=0;

   for(i=m;i<m+n;i++)
    c[i]=b[k++];

  

  int pass;
  for(pass=1;pass<m+n;pass++)
  {
    for(j=0;j<m+n-pass;j++)
    {
      if(c[j]>c[j+1])
      {
        int t=c[j];
        c[j]=c[j+1];
        c[j+1]=t;
      }
    }
  }
  System.out.println("The sorted array is : ");
  for(i=0;i<m+n;i++)
    System.out.print(c[i]+"\t");
    System.out.print("\n");

    

   

   	}

	
	
}