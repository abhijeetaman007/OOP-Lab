import java.util.Scanner;
public class Prime {
    
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);


int n,m,flag,i;
System.out.println("Enter lower bound and upper bound");
n=sc.nextInt();
m=sc.nextInt();
while (n<m)
    {
        flag = 0;

        for(i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println("\n" +n);

        n++;
    }




    }
       
    
}

