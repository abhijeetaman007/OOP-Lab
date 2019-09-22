import java.util.Scanner;

public class Addn3 {
public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  String[] s=new String[5];
  System.out.println("Input 5 strings");
  for(int i=0;i<5;i++)
    s[i]=sc.nextLine();

    for(int i=1;i<5;i++)
      s[0]=s[0].concat(s[i]);
  System.out.println(s[0]);


}
}
