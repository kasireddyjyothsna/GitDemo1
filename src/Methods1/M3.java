package Methods1;

public class M3 {
	void m1()
	{
		System.out.println("m1 method");
	}
	void m1(int a)
	{
		System.out.println("m1 paramether method");
	}
public static void main(String[] args) {
	M3 m=new M3();
	m.m1();
	m.m1(100);
}
}
