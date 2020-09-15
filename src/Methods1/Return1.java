package Methods1;

public class Return1 {
	int m1(int a)
	{
		System.out.println("m1 method");
		return 10;
	}
	float m2(float f1)
	{
		System.out.println("m2 method");
		return f1;
	}
	static String s1()
	{
		System.out.println("s1 method");
		return "jyothsna";
	}
public static void main(String[] args) {
	Return1 a =new Return1();
	int a1=a.m1(100);
	System.out.println(a1);
	
	float f2=a.m2(100.f);
	System.out.println(f2);
	
	String s3=Return1.s1();
	System.out.println(s3);
}
}
