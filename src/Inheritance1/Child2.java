package Inheritance1;
class Parent2{
	void m1()
	{
		System.out.println("parent m1 method");
	}
}
public class Child2 extends Parent2 {
	void m1()
	{
		System.out.println("m1 child method");
	}
	void m2()
	{
		this.m1();
		super.m1();
		System.out.println("m2 child method");
	}
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.m2();
	}

}
