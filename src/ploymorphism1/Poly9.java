package ploymorphism1;
class Parent9
{
	private void m1()
	{
		System.out.println("m1 parent method");
	}}
public class Poly9 extends Parent9{
	private void m1()
	{
		System.out.println("m1 child method");
	}
public static void main(String[] args) {
	Poly9 p=new Poly9();
	p.m1();
	Parent9 p2=new Parent9();

}
}
