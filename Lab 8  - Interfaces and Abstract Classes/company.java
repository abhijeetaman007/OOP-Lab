import java.util.Scanner;

interface Company {
	void calSales(int count);
	void displaySales();
	int hwprice=1500;
	int swprice=3000;
}

class Hardware implements Company {

	int totalSales;
	String category="Microcontrollers";
	String manuf="Sun Systems Pvt. LTD";
	public void calSales(int count){
     totalSales=hwprice*count;

	}

	public void displaySales() {
		System.out.println("HARDWARE SALES :\n");
		System.out.println("Category : "+category);
		System.out.println("Manufacturer :"+manuf);
		System.out.println("Total sales : Rs. "+totalSales);

	}
}

class Software implements Company {
	int totalSales;
	String type="Accounting";
	String os="macOS";
	public void calSales(int count){
		totalSales=swprice*count;
	}
	public void displaySales() {
		System.out.println("SOFTWARE SALES :\n");
		System.out.println("Type : "+type);
		System.out.println("Operating System :"+os);
		System.out.println("Total sales : Rs. "+totalSales);

	}
}

public class company {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch,count;
	System.out.println("1. HARDWARE\n2. SOFTWARE");
	ch=sc.nextInt();
	switch(ch) {
		case 1 :
		System.out.println("Input no. of products sold");
		count=sc.nextInt();
		Company c = new Hardware();
		c.calSales(count);
		c.displaySales();
		break;

		case 2:
		System.out.println("Input no. of products sold");
		count=sc.nextInt();
		c = new Software();
		c.calSales(count);
		c.displaySales();
		break;

		default : System.out.println("Invalid Choice!");


	}

	}
}