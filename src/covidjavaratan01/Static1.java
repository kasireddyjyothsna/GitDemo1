package covidjavaratan01;

public class Static1 {
	int i=100;
	int j=200;
	static void m1()
	{
		Static1 a=new Static1();
		System.out.println(a.i);
		System.out.println(a.j);
	}
	static void m2()
	{
		Static1 b=new Static1();
		System.out.println(b.i);
		System.out.println(b.j);
	}
public static void main(String[] args) {
	Static1 c=new Static1();
	System.out.println(c.i);
	System.out.println(c.j);
	Static1.m1();
	Static1.m2();
}
}
