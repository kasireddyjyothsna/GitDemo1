package ploymorphism1;
class Parent8
{
	static void m1()
	{
		System.out.println("m1 parent  method");
	}}
public class Poly8 extends Parent8 {

	static void m1()
	{
		System.out.println("m1 child method");
	}
public static void main(String[] args) {
	Parent8 p=new Poly8();
	p.m1();
	
}
}
