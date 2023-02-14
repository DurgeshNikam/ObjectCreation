public class mobile

{
	int mobno;
	String mobname;
	int mobprice;
	String mobcolour;
 	String mobbrand;

	public static void main(String []args)
{
	mobile m=new mobile();
	m.mobno=222222222;
	m.mobname="galaxy";
	m.mobprice=27000;
	m.mobcolour="rosegold";
 	m.mobbrand="samsung";

	System.out.println(m.mobno);
	System.out.println(m.mobname);
	System.out.println(m.mobprice);
	System.out.println(m.mobcolour);
	System.out.println(m.mobbrand);
}
}
	