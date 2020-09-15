package ploymorphism1;
class Parent4
{
	float m1()
	{
		System.out.println("m1 parent method");
		return 10.0f;
	}}
public class Poly4 {
	float m1()
	{
		System.out.println("m1 child method");
		return 200.0f;
	}
public static void main(String[] args) {
	Poly4 p=new Poly4();
	float f=p.m1();
	System.out.println(f);
}
}
