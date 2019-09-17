/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;
import java.util.*;
/**
 *
 * @author Aditya Kashinath
 */
class sq{
    int square(int a){
        return a*a;
    }
    float square(float a){
        return a*a;
    }
    double square(double a){
        return a*a;
    }
}
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        sq s = new sq();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element : ");
        a = in.nextDouble();
        System.out.println("Square : " + s.square(a));
    }
    
}
