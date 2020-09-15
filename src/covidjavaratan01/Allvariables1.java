package covidjavaratan01;

public class Allvariables1 {
	int i=10;
	int j=20;
	static int k1=100;
	static int k2=200;
	void m1()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(Allvariables1.k1);
		System.out.println(Allvariables1.k2);
	}
	static void m2()
	{
		System.out.println(Allvariables1.k1);
		System.out.println(Allvariables1.k2);
		Allvariables1 a=new Allvariables1();
		System.out.println(a.i);
		System.out.println(a.j);
	}
public static void main(String[] args) {
	Allvariables1 a=new Allvariables1();
	a.m1();
	Allvariables1.m2();
}
}
