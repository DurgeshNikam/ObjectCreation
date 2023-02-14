public class department

{
	int departmentID;
	String departmentname;
	int EmpID;
	String Empname;
 
	public static void main(String []args)
{
	department d=new department();
	d.departmentID=255;
	d.departmentname="sales";
	d.EmpID=2445;
	d.Empname="mahesh";

	System.out.println(d.departmentID);
	System.out.println(d.departmentname);
	System.out.println(d.EmpID);
	System.out.println(d.Empname);
}
}
	