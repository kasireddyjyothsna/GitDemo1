package covidjavaratan01;

public class Jvm1 {
	int i=10;
	int j=20;
	int k;
	char c1;
	boolean b1;
	static int x1=100;
	static int x2=200;
	static char c;
	static boolean b2;
public static void main(String[] args) {
	Jvm1 a=new Jvm1();
	System.out.println(a.i);
	System.out.println(a.j);
	Jvm1 b=new Jvm1();
	System.out.println(b.k);
	System.out.println(b.c1);
	System.out.println(b.b1);
	System.out.println(Jvm1.x1);
	System.out.println(Jvm1.x2);
	System.out.println(Jvm1.c);
	System.out.println(Jvm1.b2);

	
}
}
