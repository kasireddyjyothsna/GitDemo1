package Inheritance1;
class Parent1{
	int x=10;
	int y=20;
}
public class Child1 extends Parent1{
	int x=100;
	int y=200;
	void m1(int x,int y)
	
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
public static void main(String[] args) {
	Child1 c=new Child1();
	c.m1(1000, 2000);
}
}
