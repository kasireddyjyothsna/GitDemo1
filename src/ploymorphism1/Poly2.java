package ploymorphism1;
class Parent1
{
	void marry()
	{
		System.out.println("black girl");
	}}
public class Poly2 extends Parent1{
	void marry()
	{
		System.out.println("red girl");
	}
public static void main(String[] args) {
	Poly2 p=new Poly2();
	p.marry();
}	

}
