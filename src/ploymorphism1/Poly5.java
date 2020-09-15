package ploymorphism1;
class A{}
class B extends A{}
class Parent5
{
	A m1()
	{
		System.out.println("m1 parent  method");
		A a=new A();
		return a;
	}}
public class Poly5 extends Parent5{
	B m1()
	{
		System.out.println("m1 child method");
		B b=new B();
		return b;
	}
	public static void main(String[] args) {
	System.out.println(new Poly5().m1());	
	}

}
