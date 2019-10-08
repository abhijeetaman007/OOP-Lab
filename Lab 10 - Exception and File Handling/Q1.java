import java.util.Scanner;
import java.io.*;

public class Q1 {
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		int ch;
		do{
		System.out.println("\n1. Write\n2. Read\n3. Copy");
		ch=sc.nextInt(); sc.nextLine();
		switch(ch) {
			case 1 : writeTo(); break;
			case 2 : readFrom(); break;
			case 3 : copyTo(); break;
			default : System.out.println("invalid Choice");
		}

		}while(ch>=1&&ch<=3);
	}


	static void writeTo() {
			Scanner sc = new Scanner(System.in);
			String str;
			System.out.println("Input string to be written into file");
			str = sc.nextLine();
			byte[] b = str.getBytes();
			try {
			File f = new File("fromUser.txt");
			FileOutputStream fo = new FileOutputStream(f);
			fo.write(b);
			}

			catch(IOException e) {
				System.out.println("Error!");
			}

	}

	static void readFrom() {
		File f = new File("fromUser.txt");

		try{
			FileInputStream fi = new FileInputStream(f);
			int len = fi.available(),i=0;
			while(i!=len) {
				System.out.print((char)fi.read());
				i++;
			}
		}
		catch(IOException e) {
				System.out.println("Error!");
			}




	}

	static void copyTo() {
			File f = new File("fromUser.txt");
			File g = new File("copyUser.txt");

			try {
				FileInputStream fi = new FileInputStream(f);
				FileOutputStream go = new FileOutputStream(g);

				int len = fi.available(),i=0;
				while(i!=len) {
					go.write((char)fi.read());
					i++;
				}
			}

			catch(IOException e) {
				System.out.println("Error!");
			}


	}
}