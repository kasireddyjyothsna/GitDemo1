package ploymorphism1;
class Parent2
{
	void marry()
	{
		System.out.println("black girl");
	}}
public class Poly3 extends Parent2{
	void marry(int a)
	{
		System.out.println("red girl");
	}
public static void main(String[] args) {
	Poly3 p=new Poly3();
	p.marry();
}	

}
