import java.util.Scanner;

class Section {
  String firstName,lastName,deg;
  int regNo;
  Section(int regNo, String firstName, String lastName, String deg) {
    this.regNo=regNo;
    this.firstName=firstName;
    this.lastName=lastName;
    this.deg=deg;
  }
  Section() {
    this.regNo=0;
    this.firstName=null;
    this.lastName=null;
    this.deg=null;
  }
  void display(Section stud) {
    System.out.println("\t\t\tRegistration No : "+stud.regNo);
    System.out.println("\t\t\tFirst Name : "+stud.firstName);
    System.out.println("\t\t\tLast Name : "+stud.lastName);
    System.out.println("\t\t\tDegree : "+stud.deg);
  }

}

public class Addn2 {
  public static void main(String args[]) {
    Section[] s=new Section[10];
    s[0]=new Section(1000,"Zen","Martin","BTech");
    s[1]=new Section(1001,"Ojas","Hegde","BTech");
    s[2]=new Section(1002,"Thomas","Edison","BTech");
    s[3]=new Section(1003,"Thakur","Mallya","BTech");
    s[4]=new Section(1004,"Fernades","K","BTech");
    s[5]=new Section(1005,"Santhoshivan","C A","BTech");
    s[6]=new Section(1006,"Shruti","Pandey","BTech");
    s[7]=new Section(1007,"Aditya","Kashinath","BTech");
    s[8]=new Section(1008,"Spandan","Rivoncar","BTech");
    s[9]=new Section(1009,"Richi","Susil","BTech");

    Scanner sc=new Scanner(System.in);

  int ch=1,index;
  String key;
  Section obj=new Section();
  while(ch!=3) {
    System.out.println("1. Search by first name\n2. Search by last name\n3. Exit");
    ch=sc.nextInt(); sc.nextLine();
    switch(ch){
      case 1 :
      System.out.println("Input first name"); key=sc.nextLine();

      index = searchStudent(1,s,key);
      if(index==-1) System.out.println("Student data NOT found!");
      else obj.display(s[index]);
      break;

      case 2 :
      System.out.println("Input last name"); key=sc.nextLine();
      index = searchStudent(2,s,key);
      if(index==-1) System.out.println("\t\t\tStudent data NOT found!");
      else obj.display(s[index]);
      break;

      case 3 : break;

      default : System.out.println("Invalid Option");
    }
  }


}

public static int searchStudent(int mode,Section[] s, String k) {
int i;
if(mode==1) {
 for(i=0;i<10;i++)
  if(s[i].firstName.equalsIgnoreCase(k)) return i;
 return -1;
}
else {
  for(i=0;i<10;i++)
   if(s[i].lastName.equalsIgnoreCase(k)) return i;
  return -1;
}
}
}
