package Methods1;

public class M2 {
	void m1(int a,char c)
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(c);
	}
	static void m2(boolean b,String s)
	
	{
		System.out.println("m2 method");
		System.out.println(b);
		System.out.println(s);
	}
public static void main(String[] args) {
	M2 m=new M2();
	m.m1(100, 'j');
	M2.m2(true, "jyothsna");
}
}
