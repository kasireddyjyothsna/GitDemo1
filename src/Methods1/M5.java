package Methods1;

public class M5 {
	int x=10;
	int y=20;
	void m1(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(x+y);
	}
public static void main(String[] args) {
	M5 m=new M5();
	m.m1(100, 200);
}
}
