package Methods1;

public class M4 {
	void m1()
	{
		m2(100,'j');
		System.out.println("m1 method");
	}
	void m2(int a,char ch)
	{
		System.out.println("m2 method");
		m3(false);
	}
	void m3(boolean b)
	{
		System.out.println("m method");
	}
public static void main(String[] args) {
	M4 a=new M4();
	a.m1();
}
}
