package ploymorphism1;
class Parent7{
	void m1()
	{
		System.out.println("m1 method parent");
	}
}
public class Poly7 extends Parent7 {
	void m1()
	{
		System.out.println("m1 method child");
	}
	void m2()
	{
		System.out.println("m2 method child");
	}
public static void main(String[] args) {
Parent7 p=new Poly7();
p.m1();
Poly7 p1=(Poly7)p;
p1.m2();
}
}
