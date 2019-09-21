import java.util.Scanner;
public class Q4 {
public static void main(String args[]) {
  String p;
  String s;
  Scanner sc = new Scanner(System.in);
  System.out.println("Input primary string");
  p=sc.nextLine();
  System.out.println("Input secondary string");
  s=sc.nextLine();
  int ch=1;
  System.out.println("---String Operations---\n");
  while(ch!=5) {

  System.out.println("1. Compare\n2. Toggle Case\n3. Check Substring\n4. Replace substring\n5. Exit");
  ch=sc.nextInt();
  switch(ch) {
    case 1 :
      if(p.compareTo(s)>0) System.out.println("Primary string is greater");
      else if(p.compareTo(s)<0) System.out.println("Secondary string is greater");
      else System.out.println("Strings are equal");
      break;
    case 2 :
      StringBuffer b=new StringBuffer(p);
      for(int i=0;i<b.length();i++) {
        if(Character.isLowerCase(b.charAt(i))) b.setCharAt(i,Character.toUpperCase(b.charAt(i)));
        else b.setCharAt(i,Character.toLowerCase(b.charAt(i)));
      }
      System.out.println(b);
      break;
    case 3 :
      if(p.contains(s)) System.out.println(s+" is a substring of "+p);
      else System.out.println(s+" is a NOT a substring of "+p);
      break;
    case 4 :
     if(p.contains(s)){
       StringBuffer buf = new StringBuffer(p);
       int start=buf.indexOf(s);
       int end=start+s.length()-1;
       buf.replace(start,end+1,"Hello");
       System.out.println(buf);
     }


    break;
    case 5 : break;
    default : { System.out.println("Invalid Choice"); ch=5;}
  }

}
}
}
