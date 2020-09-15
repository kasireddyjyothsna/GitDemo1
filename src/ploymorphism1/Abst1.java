package ploymorphism1;
abstract class P
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
	}
abstract class P1 extends P
{
	void m1()
	{
		System.out.println("m1 method");
	}}

abstract class P2 extends P1
	{
		void m2()
		{
			System.out.println("m2 method");
		}}
abstract class P3 extends P2
{
	void m3()
	{
		System.out.println("m3 method");
	}}


public class Abst1 extends P3 {
void m4()
{
	System.out.println("m4 method");}
}
