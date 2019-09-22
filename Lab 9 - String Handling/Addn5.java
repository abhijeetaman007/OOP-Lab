import java.util.Scanner;

public class Addn5 {
  public static void main(String args[]) {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input a five letter word");
    str=sc.nextLine();
    if(str.length()!=5) System.out.println("Invalid Input!");
    else {
      StringBuffer tlw = new StringBuffer("tlw");

      int i,j,k,l=0;
      for(i=0;i<5;i++){
        for(j=0;j<5;j++) {
          for(k=0;k<5;k++) {
            if(i==j||i==k||j==k) continue;
            else {
              tlw.setCharAt(0,str.charAt(i));
              tlw.setCharAt(1,str.charAt(j));
              tlw.setCharAt(2,str.charAt(k));
              System.out.println(tlw);
            }
          }
        }
      }

    }
  }
}
