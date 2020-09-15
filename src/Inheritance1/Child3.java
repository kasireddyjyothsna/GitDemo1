package Inheritance1;
class Parent3
{
	Parent3()
	{
		System.out.println("parent constructor");
	}
	}
public class Child3 extends Parent3 {
	Child3()
	{
		this(10);
		System.out.println("child zero arg cons");
	}
	Child3(int a)
	{
		super();
		System.out.println("child one arg cons");
	}
public static void main(String[] args) {
	Child3 c=new Child3();
	
	
}
}
