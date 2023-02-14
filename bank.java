//Variable Initialization.......// Object Creation....
public class bank

{
	int acno = 1234567890;
	String acholdername = "Sharma";
	String acaddress = "Pune";
	int acbalance= 24000;
 	long acadharno= 12342341234l;
	String acpanno = "ABCPN1234D";
		public static void main(String []args)
	{
		bank b=new bank();
				
		System.out.println("Account Number =  "+b.acno);
		System.out.println("Account Holder Name =  " +b.acholdername);
		System.out.println("Bank Address = "+b.acaddress);
		System.out.println("Acount Balance = "+b.acbalance);
		System.out.println("Adhar card number =  "+b.acadharno);
		System.out.println("Pan card number = "+b.acpanno);
	}
}
	