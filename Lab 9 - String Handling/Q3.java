import java.util.Scanner;

public class Q3{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str;
    int ch=1;
    System.out.println("Input a string");
    str=sc.nextLine();
    System.out.println("---String Operations---\n");
    while(ch!=5) {

    System.out.println("1. palindromeCheck()\n2. sortAlphabetical()\n3. reverse()\n4. Concatenate original string with reversed String\n5. Exit");
    ch=sc.nextInt();
    switch(ch) {
      case 1 : palindromeCheck(str);
      break;
      case 2 : sortAlphabetical(str);
      break;
      case 3 : reverse(str);
      break;
      case 4 : concatRev(str);
      break;
      case 5 : break;
      default : { System.out.println("Invalid Choice"); ch=5;}
    }

  }
  }


  public static void palindromeCheck(String str) {
    int i,j=str.length(),flag=0;
    for(i=0;i<(str.length()/2);i++) {
      if(str.charAt(i)!=str.charAt(j-i-1)) {
        flag=1;
        break;
      }
    }
    if(flag==0) System.out.println(str+ " is a palindrome");
    else System.out.println(str+ " is NOT a palindrome");
  }

  public static void concatRev(String str){

  StringBuffer rev = new StringBuffer(str);
  rev.reverse();
  str=str.concat(rev.toString());
  System.out.println("Result : "+str);
}

  public static void reverse(String str){
    StringBuffer rev= new StringBuffer(str);
    rev.reverse();
    System.out.println("Result : "+rev);
  }

  public static void sortAlphabetical(String str){

  int i,j;
  StringBuffer strb=new StringBuffer(str);
  char temp;
  for(i=0;i<strb.length()-1;i++){
    for(j=0;j<strb.length()-i-1;j++) {
      if(strb.charAt(j)>strb.charAt(j+1)) {
        temp=strb.charAt(j);
        strb.setCharAt(j,strb.charAt(j+1));
        strb.setCharAt(j+1,temp);
      }
    }
  }

  System.out.println("Result :"+strb);
}
}
