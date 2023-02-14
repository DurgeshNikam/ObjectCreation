
public class Employee {
	int id;
	String name;
	String address;
	int balance;
 	long adharno;
	String panno;

	public static void main(String []args)
{
	Employee e = new Employee();
			e.id = 123;
			e.name = "Ram";
			e.address = "Pune";
			e.balance = 45000;
			e.adharno = 123412341234l;
			e.panno = "ABCPN1234D";
	
	System.out.println("Employee ID = "+e.id);//0
	System.out.println("Employee Name = "+e.name);//null
	System.out.println("Emplyoee Address = "+e.address);//null
	System.out.println("Employee Last Balance = "+e.balance);//0
	System.out.println("Employee Adhar No. = "+e.adharno);//0.0
	System.out.println("Employee Pan No. = "+e.panno);//0.0
}
}
