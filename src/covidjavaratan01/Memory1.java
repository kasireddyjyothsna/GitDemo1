package covidjavaratan01;

public class Memory1 {
	int i=10;
	static int j=20;
public static void main(String[] args) {
	Memory1 a=new Memory1();
	System.out.println(a.i);
	System.out.println(a.j);
	a.i=100;
	a.j=200;
	System.out.println(a.i);
	System.out.println(a.j);
	Memory1 b=new Memory1();
	System.out.println(b.i);
	System.out.println(b.j);
	b.i=1000;
	b.j=2000;
	System.out.println(b.i);
	System.out.println(b.j);
	
	
}
}
