import java.util.Scanner;

public class Q1{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("Input a string");
    str=sc.nextLine();
    int i,countw=0,countv=0;
    str=str.toLowerCase();
    for(i=0;i<str.length();i++){
    if(str.charAt(i)==' ') countw++;
    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') countv++;
  }
    countw++;
    System.out.println("No. of words = "+countw);
    System.out.println("No. of characters(including spaces) = "+str.length());
    System.out.println("no. of vowels = "+countv);
  }
}
