package Inheritance1;
class Parent4{
	{
		System.out.println("parent instance block");
	}
	Parent4()
	{
		System.out.println("parent constructor");
	}
	static
	{
		System.out.println("static block parent");
	}
}
public class Child4 extends Parent4{
	{
		System.out.println("child instance block");
	}
	Child4()
	{
		System.out.println("child cons");
	}
	static
	{
		System.out.println("static block child");
	}
	public static void main(String[] args) {
		Child4 a=new Child4();
		Child4 a1=new Child4();
		
	}
}
