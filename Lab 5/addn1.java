
import java.util.Scanner;

class Result{
    private int m[][] = new int[3][3];
    private int s[] = new int[3];
    int pos = 0;
    Scanner in = new Scanner(System.in);
    public void accept(){
        for(int i = 0; i < 3; i++){
            System.out.println("Input marks of R.No " + (i+1));
            for(int j = 0; j < 3; j++)
                m[i][j] = in.nextInt();
        }
    }
    public void total(){
        for(int i = 0; i < 3; i++)
            s[i] = m[i][0] + m[i][1] + m[i][2];
    }
    public void high(){
        int large;
        int j;
        
        for(int i = 0; i < 3; i++)
        {
            large = m[0][i];  
            for(j = 0; j < 3; j++)
            {
                if(large < m[j][i])
                {
                     large = m[j][i];
                     pos = j;
                }
            }
            System.out.println("Subject " + (i+1)+"has the highest marks scored by student with Roll No."+(pos+1));
            pos = 0;
        }
    }
    public void hightotal(){
        int large = s[0];
        for(int i = 0; i < 3; i++){
            if(s[i] > large)
            {
                large = s[i];
                pos = i + 1;
            }
        }
        System.out.print("Highest Total Marks of "+large+" is scored by student with Roll number "+pos);
    }
}
public class addn1 {

  
    public static void main(String[] args) {
        Result res = new Result();
        res.accept();
        res.total();
        res.high();
        res.hightotal();
    }
    
}
