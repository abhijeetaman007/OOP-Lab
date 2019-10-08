import java.util.Scanner;
import java.io.*;




public class Q4 {
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		int ch;
		do{
		System.out.println("\n1. Write\n2. ReadOriginal\n3. Encrypt\n4. ReadDecrypt");
		ch=sc.nextInt(); sc.nextLine();
		switch(ch) {
			case 1 : writeTo(); break;
			case 2 : readOrig(); break;
			case 3 : encrypt(); break;
			case 4 : readDecr(); break;
			default : System.out.println("invalid Choice");
		}

		}while(ch>=1&&ch<=4);
	}


	static void writeTo() {
			Scanner sc = new Scanner(System.in);
			String str;
			System.out.println("Input string to be written into file");
			str = sc.nextLine();
			byte[] b = str.getBytes();
			try {
			File f = new File("orig.txt");
			FileOutputStream fo = new FileOutputStream(f);
			fo.write(b);
			}

			catch(IOException e) {
				System.out.println("Error!");
			}

	}

	static void readOrig() {
		File f = new File("orig.txt");

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

	static void encrypt() {

		File f = new File 
		

	}

	static void readDecr() {

	}
	

}