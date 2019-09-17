


import java.util.Scanner;
public class matrixOp {
    static void multiply(int a[][], int b[][], int r1, int c1, int r2, int c2)
    {
        int c[][] = new int [5][5];
        int i, j, k;
        for(i = 0; i < 5; i++)
            for(j = 0; j < 5; j++)
                c[i][j] = 0;
        if(c1 == r2)
        {
            for(i = 0; i < r1; i++)
                for(j = 0; j < c2; j++)
                    for(k = 0; k < c1; k++)
                        c[i][j] += a[i][k]*b[k][j];
            System.out.println("MATRIX MULTIPLICATION : ");
            for(i = 0; i < r1; i++)
            {
               for(j = 0; j < c2; j++)
                    System.out.print(c[i][j] + "\t");
               System.out.println();
            }
        }
        else
            System.out.println("ERROR, CANNOT MULTIPLY");
    }
    static void add(int a[][], int b[][], int r1, int c1, int r2, int c2)
    {
        int c[][] = new int [5][5];
        int i, j;
        for(i = 0; i < 5; i++)
            for(j = 0; j < 5; j++)
                c[i][j] = 0;
        if(r1 == r2 && c1 == c2)
        {
            for(i = 0; i < r1; i++)
                for(j = 0; j < c2; j++)
                        c[i][j] = a[i][j] +b[i][j];
            System.out.println("MATRIX ADDITION : ");
            for(i = 0; i < r1; i++)
            {
                    
               for(j = 0; j < c2; j++)
                    System.out.print(c[i][j] + "\t");
               System.out.println();
            }
        }
        else
            System.out.println("ERROR, CANNOT ADD");
    }
    public static void main(String[] args) {
        int a[][] = new int [5][5];
        int b[][] = new int [5][5];
        int r1, c1, r2, c2;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS : ");
        r1 = in.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS : ");
        c1 = in.nextInt();
        int i, j;
        System.out.println("ENTER ELEMENTS FOR MATRIX A : ");
        for(i = 0; i < r1; i++)
            for(j = 0; j < c1; j++)
                a[i][j] = in.nextInt();
        System.out.println("ENTER NUMBER OF ROWS : ");
        r2 = in.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS : ");
        c2 = in.nextInt();  
        System.out.println("ENTER ELEMENTS FOR MATRIX B : ");
        for(i = 0; i < r2; i++)
            for(j = 0; j < c2; j++)
                b[i][j] = in.nextInt();
        multiply(a, b, r1, c1, r2, c2);
        add(a, b, r1, c1, r2, c2);
        
    }
    
}
