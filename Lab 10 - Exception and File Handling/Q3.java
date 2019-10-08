import java.util.Scanner;
import java.io.*;

public class Q3 {
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		int ch;
		do{
		System.out.println("\n1. No. of characters\n2. No. of vowels\n3. No. of line\n4. No. of words");
		ch=sc.nextInt(); sc.nextLine();
		switch(ch) {
			case 1 : charcount(); break;
			case 2 : vowelcount(); break;
			case 3 : linecount(); break;
			case 4 : wordcount();break;
			default : System.out.println("invalid Choice");
		}

		}while(ch>=1&&ch<=4);
	}

	static void charcount() {
		File f = new File("test.txt");
		try {
		FileInputStream fi = new FileInputStream(f);
		System.out.println("No. of characters = "+fi.available());
		}

		catch(IOException e ) {
			System.out.println("Error!");
		}
	}

	static void vowelcount() {

		File f = new File("test.txt");
		try {
		FileInputStream fi = new FileInputStream(f);
		int i,count=0;
		while((i=fi.read())!=-1) {
			if((char)i=='A'||(char)i=='E'||(char)i=='I'||(char)i=='O'||(char)i=='U'||(char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u')
				count++;
		}
		System.out.println("No. of vowels = "+count);

		}

		catch(IOException e ) {
			System.out.println("Error!");
		}
	}
	static void linecount() {

		File f = new File("test.txt");
		
		try{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str; int count=0;
		while((str=br.readLine())!=null)
			count++;
		System.out.println("no. of lines = "+count);
		}
		catch(IOException e ) {
			System.out.println("Error!");
		}


	}
	static void wordcount() {

		File f = new File("test.txt");
		try{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str; int count=0;
		String[] word = {};
		while((str=br.readLine())!=null) {
			word = str.split(" ");
			count=count+word.length;
		}
		System.out.println("no. of words = "+count);
		}
		catch(IOException e ) {
			System.out.println("Error!");
		}

			}

	

	
}