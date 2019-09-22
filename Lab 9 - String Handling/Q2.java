import java.util.Scanner;

public class Q2{
   public static void main(String[] args) {
    String word,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input word");
    word=sc.nextLine();
    System.out.println("Input character");
    c=sc.next();

    String replaceWord=new String();
    for(int i=0;i<word.length();i++) {
      replaceWord=replaceWord.concat(c);
    }
    System.out.println(replaceWord);
  }
}
