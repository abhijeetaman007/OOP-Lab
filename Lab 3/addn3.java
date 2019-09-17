import java.util.Scanner;
public class addn3 {
    
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int[] a = new int[100];
int n,k=1;
int i,j;
System.out.println("Input n");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(k++ +" ");
}
System.out.println("");
}

    }
       
    
}
