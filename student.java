public class student
{
	int rollno=101;
	String name="ABC";
	public void m1()
{
	int y=300;
	System.out.println(y);
}
	public static void main(String[]args)
	{
	student s= new student();
	System.out.println(s.rollno);
	System.out.println(s.name);
		s.m1();
}
}