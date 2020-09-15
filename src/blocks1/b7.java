package blocks1;

public class b7 {
	int i=10;
	static int j=20;
	
	void m1()
	{
		System.out.println(i);
		System.out.println(b7.j);
	System.out.println("instance m1 method");
	}
	
	static void m2(String st)
	{
		b7 a1=new b7();
		System.out.println(a1.i);
		System.out.println(b7.j);
		System.out.println(st);
		System.out.println("static m2 method");
	}
	
	
	b7()
	{
		System.out.println("zero arg cons");
	}
	
	b7(int a)
	{
		System.out.println("one arg cons");
	}
	
	{
		System.out.println("instance block");
	}
	static
	{
		System.out.println("static block");
	}
public static void main(String[] args) {
	b7 q1=new b7(10);
	b7 q2=new b7();
	q1.m1();
	q2.m1();
b7.m2("jyothsna");
	
}
}


