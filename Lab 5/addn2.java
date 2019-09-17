/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;
import java.util.Scanner;

/**
 *
 * @author Aditya Kashinath
 */
class Array{
    private int a[] = new int [10];
    int i;
    Scanner in = new Scanner(System.in);    
    void input(){
        System.out.println("ENTER ALL ELEMENTS OF ARRAY : ");
        for(i = 0; i < 10; i++)
            a[i] = in.nextInt();
    }
    void display(){
        System.out.println("THE ARRAY IS : ");
        for(i = 0; i < 10; i++)
            System.out.print(" " + a[i]);
        System.out.println();
    }
    void largest(){
        int large;
        large = a[0];
        for(i = 1; i < 10; i++){
            if(a[i] > large)
                large = a[i];
        }
        System.out.println("LARGEST VALUE : " + large);
    }
    void average(){
        int sum = 0;
        for(i = 0; i < 10; i++)
            sum += a[i];
        System.out.println("AVERAGE : " + (sum / 10));
    }
    void ascending(){
        int j = 0;
        int temp;
        for(j = 0; j < 10; j++)
            for(i = 0; i < 9; i++)
                if(a[i+1] < a[i])
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
        display();
    }
}
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array a = new Array();
        a.input();
        a.display();
        a.largest();
        a.average();
        a.ascending();
    }
}
