// Object Creation and Initialization....
public class Client {
	int id;
	String name;
	String address;
	int balance;
 	long adharno;
	String panno;

	public static void main(String []args)
{
	Client c=new Client();
			c.id = 1234;
			c.name = "Ram sharma";
			c.address = "pune";
			c.balance = 50000;
			c.adharno = 123412341234l;
			c.panno = "ABCPN1111D";
	
	System.out.println("Id = "+c.id);//0
	System.out.println("Name = "+c.name);//null
	System.out.println("Address = "+c.address);//null
	System.out.println("Balance = "+c.balance);//0
	System.out.println("Adhar card no. = "+c.adharno);//0.0
	System.out.println("Pan card no. = "+c.panno);//0.0
}
}
