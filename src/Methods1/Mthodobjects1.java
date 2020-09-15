package Methods1;
class X{}
class Y{}
class Z{}
class M{}
public class Mthodobjects1 {
	void m1(X x1,Y y1)
	{
		System.out.println("m1 mmethod");
		System.out.println(x1);
		System.out.println(y1);
	}
	static void m2(Z z1,M m1)
	{
		System.out.println("m2 method");
		System.out.println(z1);
		System.out.println(m1);
	}
public static void main(String[] args) {
	Mthodobjects1 a=new Mthodobjects1();
	//a.m1(new X(), new Y());
	//Mthodobjects1.m2(new Z(), new M());
	X x2=new X();
	Y y2=new Y();
	Z z2=new Z();
	M m2=new M();
	a.m1(x2, y2);
	Mthodobjects1.m2(z2,m2);
	
}
}
