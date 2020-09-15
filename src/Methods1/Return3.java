package Methods1;
class K1{}
class K2{}

public class Return3 {
	K1 m1()
	{
		System.out.println("m1 method");
		K1 k=new K1();
		return k;
	}
	K2 m2()
	{
		System.out.println("m2 method");
		K2 k2=new K2();
		return k2;
		
	}
public static void main(String[] args) {
	Return3 a=new Return3();
	K1 p1=a.m1();
	System.out.println(p1);
	
	K2 p2=a.m2();
	System.out.println(p2);
}
}
