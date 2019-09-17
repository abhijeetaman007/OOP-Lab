import java.util.Scanner;
public class Search {
    
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int key,count=0,i;
int[] a= {1,2,3,1,2,1,5,6,7};
int flag=0;
System.out.println("Input search value");
key=sc.nextInt();
System.out.println("Found at" );
for(i=0;i<9;i++)
{
if(a[i]==key) { System.out.print(i+" ");
}

}
if(flag==0)System.out.println("NOT FOUND");







    }
       
    
}
