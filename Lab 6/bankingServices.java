import java.util.Scanner;

class Account {
    
	private int accNum;
	private String Name, accType;
	int closingBalance=0;

	Account() {
		accNum=0;
		Name="NULL";
		accType="NULL";
	}

	Account(int accNum,String Name,String accType) {
		this.accNum=accNum;
		this.Name=Name;
		this.accType=accType;
	}
  public void displayAccount()
	{   

		System.out.println("Account No : "+accNum);
		System.out.println("Name : " +Name);
		System.out.println("Account Type : " +accType);
	} 
    
}

class Savings extends Account {

	

    Savings(int accNum,String Name,String accType)
    {
     super(accNum,Name,accType);
     closingBalance=0;

    }

    public void displayAccount() {
    	super.displayAccount();
    	
    	System.out.println("Closing Balance : INR "+closingBalance);
    }
    public void deposit(int dep) {
    	closingBalance+=dep; 
    	System.out.println("INR "+dep+" credited to account!");
    }

    public void Withdraw(int wid) {
    	if(closingBalance>=wid) {
    		closingBalance-=wid;
    		System.out.println("INR "+wid+" debited from account");
    	}
    	else System.out.println("Insufficient Funds!\n Available Balance is : INR "+closingBalance);
    }
    public void creditInterest(int rate, float time) {
    	float totalInterest=(closingBalance*time*rate)/100;
    	closingBalance+=totalInterest;
    	System.out.println("Account credited with an Interest of INR "+totalInterest);
    }



	
}

class Current extends Savings {


	Current(int accNum,String Name,String accType)
    {
     super(accNum,Name,accType);
     closingBalance=0;

    }

   
    public void impose()
    {
    	if(closingBalance<5000)
    	{   closingBalance-=750;
    		System.out.println("Minimum balance not maintained! Service Tax of INR 750 imposed!");
    	}
    	else
    	{
    		System.out.println("Sufficient account balance maintained. No Tax Imposed.");
    	}
    }
  


}

public class bankingServices{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int ch,mAccNum=1000,amt,rate;
float time;
String mName;
System.out.println("*****Banking Services*****\n");
System.out.println("Press 1 to create new account");
ch=sc.nextInt();
if(ch==1) {

System.out.println("Account Type :: 1 - Savings | 2- Current");
ch=sc.nextInt();
sc.nextLine();
if(ch==1)
{
 System.out.println("Name:");
 mName=sc.nextLine();
 Savings mSavings=new Savings(mAccNum++,mName,"SAVINGS");
 System.out.println("Account creation successfull!\n");

while(ch!=0){
 System.out.println("\nServices::\n\n1. Deposit\n2. Withdraw\n3. Credit Interest\n4. Account Summary\n0. Exit");
 ch=sc.nextInt();
 if(ch==1) {
 	System.out.println("Enter amount to be credited:");
    amt=sc.nextInt();
    mSavings.deposit(amt);
    
    
 }
 if(ch==2) {
 	System.out.println("Enter amount to be debited:");
    amt=sc.nextInt();
    mSavings.Withdraw(amt);
   
 }
 if(ch==3) {
    System.out.println("Interest Rate :");
    rate=sc.nextInt();
    System.out.println("Time Period (in years) :");
    time=sc.nextFloat();
    mSavings.creditInterest(rate,time);
 }
 if(ch==4) mSavings.displayAccount();



}
}
else if(ch==2) {
System.out.println("Name:");
 mName=sc.nextLine();
 Current mCurrent=new Current(mAccNum++,mName,"CURRENT");
 System.out.println("Account creation successfull!\n");

while(ch!=0){
 System.out.println("\nServices::\n\n1. Deposit\n2. Withdraw\n3. Impose service tax\n4. Account Summary\n0. Exit");
 ch=sc.nextInt();
 if(ch==1) {
 	System.out.println("Enter amount to be credited:");
    amt=sc.nextInt();
    mCurrent.deposit(amt);
    
    
 }
 if(ch==2) {
 	System.out.println("Enter amount to be debited:");
    amt=sc.nextInt();
    mCurrent.Withdraw(amt);
   
 }
 if(ch==3){
 mCurrent.impose();
 }
 if(ch==4){
 	mCurrent.displayAccount();
 }


}
}
else System.out.println("Quitting!!");
	}
}
}
