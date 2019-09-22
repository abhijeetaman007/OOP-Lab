import java.util.Scanner;

public class Addn1{

  public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    String[] s = new String[5];
    StringBuffer[] b = new StringBuffer[5];
    System.out.println("Input 5 strings :");
    for(int i=0;i<5;i++) {
      s[i]=sc.nextLine();

    }
    String temp = new String();
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4-i;j++){
        if(s[j].compareTo(s[j+1])>0) {
          temp=s[j];
          s[j]=s[j+1];
          s[j+1]=temp;
        }
      }
    }
    System.out.println("");
    for(int i=0;i<5;i++)
    System.out.println(s[i]);


  }
}
