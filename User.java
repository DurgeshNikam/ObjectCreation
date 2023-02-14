public class User

{
	int Uid;
	String Uname;
	String Upassword;
 	String Uaddress;

	public static void main(String []args)
{
	User U=new User();
	U.Uid=2491;
	U.Uname="Ram";
	U.Upassword="November";
 	U.Uaddress="Delhi";

	System.out.println(U.Uid);
	System.out.println(U.Uname);
	System.out.println(U.Upassword);
	System.out.println(U.Uaddress);
}
}
	