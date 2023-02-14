
public class Pen {
	int no;
	String name;
	String producttype;
	String batch;
	String pencompany;

	public static void main(String []args)
{
	Pen p=new Pen();
		p.no = 1234;
		p.name = "Cello Gripper";
		p.producttype = "Stationary";
		p.batch = "may 2020";
		p.pencompany = "Cello";
	
	System.out.println("Product Number = "+p.no);//0
	System.out.println("product's Name = "+p.name);
	System.out.println("Product's Type =  "+p.producttype);
	System.out.println("Product's Batch = "+p.batch);
	System.out.println("Product's Company Name = "+p.pencompany);
}
}
