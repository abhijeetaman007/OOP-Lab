import java.util.Scanner;

class Box {

private int width,height,depth,vol;


 Box(int width,int height,int depth)
 {
    this.width=width;
    this.height=height;
    this.depth=depth;
 }
 public int volume()
 {
   vol=this.width*this.height*this.depth;
  
   return vol;
 }


}
public class cBox{


	public static void main(String args[]) 
	{  
        
     Scanner sc=new Scanner(System.in);
     int x,y,z;
     System.out.println("Input dimensions of the box");
     x=sc.nextInt();
     y=sc.nextInt();
     z=sc.nextInt();
     Box b=new Box(x,y,z);
     System.out.println("Constructing box...");
     System.out.println("Box constructed with the given dimensions.");
     
     System.out.println("Volume of the box is "+b.volume()+" cubic units");

      
	}
}