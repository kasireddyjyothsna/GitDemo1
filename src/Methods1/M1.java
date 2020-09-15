package Methods1;

public class M1 {
	void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}
public static void main(String[] args) {
	M1 m=new M1();
	m.m1();
M1.m2();
}
}
