package covidjavaratan01;

public class Instancevariabl1 {
	
	int i=10;
	int j=20;
	void m2()
	{
		System.out.println(i);
		System.out.println(j);
	}
public static void main(String[] args) {
	Instancevariabl1 a=new Instancevariabl1();
	System.out.println(a.i);
	System.out.println(a.j);
	a.m2();
}
}
