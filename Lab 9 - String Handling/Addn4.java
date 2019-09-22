import java.util.Scanner;

public class Addn4{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String phoneNo,areaCode,prim,sec;
    Phone p = new Phone();

    System.out.println("Input Phone Number : (in (555)555-5555 format)");
    phoneNo=sc.nextLine();
    if(!p.validate(phoneNo)) { System.out.println("Input is INVALID! Try again!");}
    else {
    p.extract(phoneNo);
    p.display();
    }
  }
}

class Phone{
  String areaCode,prim,sec;

  boolean validate(String phoneNo) {

    if(phoneNo.charAt(0)!='('||phoneNo.charAt(4)!=')'||phoneNo.charAt(8)!='-'||phoneNo.length()!=13)
    return false;
    return true;
  }

  void extract(String phoneNo) {
    areaCode=phoneNo.substring(1,4);
    prim=phoneNo.substring(5,8);
    sec=phoneNo.substring(9,13);
  }

  void display() {
    System.out.println("Area Code : "+areaCode);
    System.out.println("Phone No. "+prim.concat(sec));
  }
}
