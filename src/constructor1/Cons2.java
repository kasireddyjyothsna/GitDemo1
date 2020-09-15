package constructor1;

public class Cons2 {
	void m1()
	{
		System.out.println("m1 method");
	}
	Cons2()
	{
		System.out.println("zero arg cons");
	}
	Cons2(int a)
	{
		System.out.println("1 arg cons");
	}
	Cons2(int a ,char ch)
	{
		System.out.println(a);
		System.out.println(ch);
		System.out.println("2arg cons");
	}
public static void main(String[] args) {
	Cons2 a=new Cons2();
	a.m1();
	Cons2 a1=new Cons2(100);
	Cons2 a2=new Cons2(10,'h');
	a1.m1();
	a2.m1();
}
}
