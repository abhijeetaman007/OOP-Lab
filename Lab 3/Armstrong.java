import java.util.Scanner;
public class Armstrong {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,rem,sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt(); int org=n;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n/=10;
        }
        if(org==sum) System.out.println(org+" is an Armstrong number");
        else System.out.println(org+ " is NOT an Armstrong number");
        
    }
       
    
}
