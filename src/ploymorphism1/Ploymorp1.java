package ploymorphism1;

public class Ploymorp1 {
	void m1()
	{
		System.out.println("m1 method");
	}
	void m1(int a)
	{
		System.out.println("m1 one ARG method");
	}
	
	void m1(String s) 
	{
		System.out.println("string method");
	}
	void m1(String s,int v) 
	{
		System.out.println("string method");
	}
public static void main(String[] args) {
	Ploymorp1 a=new Ploymorp1();
	a.m1();
	a.m1(10);
	a.m1("jyothsna");
	a.m1
	("tam",100);
}
}
