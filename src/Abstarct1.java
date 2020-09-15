abstract class A{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("m4 method");
	}
}
public class Abstarct1 extends A{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m2 method");
	}
	void m3()
	{
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
	A a=new Abstarct1();
	a.m1();
	a.m2();
	a.m3();
	a.m4();
	Abstarct1 a1=new Abstarct1();
	a1.m1();
	a1.m2();
	a1.m3();
	a1.m4();
	}

}
