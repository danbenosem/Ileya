import java.util.ArrayList;
import java.util.Scanner;

public class Checkout{




public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
ArrayList<String>product= new ArrayList<String>();
ArrayList<Integer>pieces= new ArrayList<Integer>();
ArrayList<Double>unit= new ArrayList<Double>();
String customerName;
	System.out.println("What is the customer name:");
	  customerName= input.nextLine();
	
	while (true){
 
	
	  
	 
	 
	  
	System.out.println("What did the user buy");
	String product1= input.next();
	 product.add(product1);
	 
	 	 
	System.out.println("How many pieces");
	int pieces1 = input.nextInt();
	 pieces.add(pieces1);
	 
	 	System.out.println("How much per unit");
	Double unit1 = input.nextDouble();
	 unit.add(unit1);
	 
	 
	 	System.out.println("Add more items?");
		
		String option= input.next();
		
	 	
		 if (option.equalsIgnoreCase("no")){
			 
			 
			 break;
		 }
	 input.nextLine();
	 
	}
	
	 input.nextLine();
		
	 System.out.println("What is your name:");
	 String cashierName= input.nextLine();
	 System.out.println("");
		System.out.println("");
	 
	 

	

	
	
	
	
	
		 
    System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA,LAGOS");
	System.out.println("TEL:03293828343");
	System.out.println("Date:18-Dec-22 8:48:11pm");
	System.out.print("");
	System.out.printf("cashier: %s%n", cashierName);
	System.out.printf("CustomerName:%s%n", customerName);
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("===================================================================");
	System.out.println("ITEM    QTY    PRICE   TOTAL(NGN)");
	
	double total=0;
		for (int index=0; index<product.size(); index++){
	System.out.printf("%s    %d   %.2f    %.2f %n",product.get(index),pieces.get(index),unit.get(index), pieces.get(index)* unit.get(index) );
	total+=pieces.get(index)* unit.get(index);
	
	
	
		}
		
			
	
	
	
	
	double discount= total * 0.08;
	double vat= 0.1758 * total;
	
	double billTotal= total+ vat- discount; 	
	
		
			 System.out.println("");
		System.out.println("");
	
	System.out.println("--------------------------------------------------------------------------");
	System.out.printf("                                   Sub  Total: %.2f%n", total);
	System.out.printf("                                   Discount:%.2f%n", discount);
	System.out.printf("                                   VAT @ 17.50:%.2f%n", vat);
	System.out.println("");
	
	System.out.println("===========================================================================");
	System.out.printf("                                   BillTotal:%.2f%n", billTotal);
	
		System.out.println("===========================================================================");
System.out.printf(" THIS IS NOT A RECEIPT KINDLY PAY %f%n",billTotal);
	
System.out.println("===========================================================================");
		
		
		
			System.out.println("How much did the customer give you");
			double amountPaid= input.nextDouble();
			
			double  Balance= amountPaid-billTotal;
			
			
			
			
			
			
			
			
			
		  System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA,LAGOS");
	System.out.println("TEL:03293828343");
	System.out.println("Date:18-Dec-22 8:48:11pm");
	System.out.print("");
	System.out.printf("cashier: %s%n", cashierName);
	System.out.printf("CustomerName:%s%n", customerName);
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("===================================================================");
	System.out.println("ITEM    QTY    PRICE   TOTAL(NGN)");
	
	
		for (int index=0; index<product.size(); index++){
	System.out.printf("%s    %d   %.2f    %.2f %n",product.get(index),pieces.get(index),unit.get(index), pieces.get(index)* unit.get(index) );
	
	
	
	
		}
		
				 System.out.println("");
		System.out.println("");
			System.out.println("--------------------------------------------------------------------------");
	System.out.printf("                                Sub  Total: %.2f%n", total);
	System.out.printf("                                Discount:%.2f%n", discount);
	System.out.printf("                                VAT @ 17.50:%.2f%n", vat);
	System.out.println("");
	
    System.out.println("===========================================================================");
	System.out.printf("                                Bill total: %.2f%n", billTotal);
	System.out.printf("                                Amount paid:%.2f%n", amountPaid);
	System.out.printf("                                Balance:%.2f%n", Balance);
	System.out.println("");
	

	
		System.out.println("===========================================================================");
	System.out.println(" THANK YOU FOR YOUR PATRONAGE");
	
		System.out.println("===========================================================================");
			
			

	



}
















}
