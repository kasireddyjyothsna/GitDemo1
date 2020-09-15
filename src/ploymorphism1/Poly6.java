package ploymorphism1;
class Parent6
{
	static void m1() {
	System.out.println("parent m1 method");}
	}
public class Poly6 extends Parent6 {
	static void m1()
	{
	System.out.println("child m1 method");}
	public static void main(String[] args) {
		Poly6 p=new Poly6();
		p.m1();
		Parent6 p1=new Poly6();
		p1.m1();
	}

}
