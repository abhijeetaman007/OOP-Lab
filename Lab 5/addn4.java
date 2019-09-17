/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4;
import java.util.*;
/**
 *
 * @author Aditya Kashinath
 */
class stack{
    int MAXSIZE;
    int a[];
    int top;
    stack(){
        MAXSIZE = 10;
        top = -1;
        a = new int [MAXSIZE];
    }
    Scanner in = new Scanner(System.in);
    public void push(){
        if(top == MAXSIZE - 1){
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            System.out.println("Enter element : ");
            a[top] = in.nextInt();
        }
    }
    public void pop(){
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Element popped : " + a[top]);
            top--;
        }
    }
    public void display(){
        int temp = top;
        while(temp != -1){
            System.out.print(" " + a[temp]);
            temp--;
        }
        System.out.println();
    }
}
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack s = new stack();
        Scanner in = new Scanner(System.in);
        int ch;
        do{
            System.out.println(" 1. Push \n 2. Pop \n 3. Display \n 4. Exit \n Enter choice : ");
            ch = in.nextInt();
            switch(ch){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
            }
        }while(ch != 4);
    }
    
}
