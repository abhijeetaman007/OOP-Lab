
class Addn6{
 static int i;
 static String s;
 //Static method
 static void display()
 {
 //Its a Static method
 Addn6 obj1=new Addn6();

System.out.println("i:"+obj1.i);

System.out.println("i:"+obj1.i);
 } 
 void funcn()
 {
 //Static method called innon-static method display();
 }
 public static void
main(String args[]) //Its a Static Method
 {
 //Static method called in another static method
 display();
 }
} 
