// Variable Declaration.....//With object creation
public class Bike {
	int Chesisno;
	String Bikename;
	String Bikelocation;
	int Downpayment;
 	int Loanamount;
	char BikeModel;

	public static void main(String []args)
{
	Bike b=new Bike();
		
	
	System.out.println("Chesis Number = "+b.Chesisno);
	System.out.println("Bike Name = "+b.Bikename);
	System.out.println("Bike Location = "+b.Bikelocation);
	System.out.println("Bike Downpayment = "+b.Downpayment);
	System.out.println("Bank Loan = "+b.Loanamount);
	System.out.println("Bike Model Series = "+b.BikeModel);
	
}
}
