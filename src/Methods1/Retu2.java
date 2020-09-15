package Methods1;

public class Retu2 {
	Retu2 m1()
	{
		System.out.println("m1 method");
		Retu2 a=new Retu2();
		return a;
	}
	Retu2 m2()
	{
	System.out.println("m2 method");
	return this;
	}
public static void main(String[] args) {
	Retu2 a=new Retu2();
	Retu2 a1=a.m1();
	Retu2 b1=a.m2();
	System.out.println(a1);
	System.out.println(b1 );
}
}
