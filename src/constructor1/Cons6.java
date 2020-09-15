package constructor1;

public class Cons6 {
	int eid;
	String ename;
	float esal;
	void disp()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	Cons6()
	{
		eid=1;
		ename="jyothsna";
		esal=1000;
	}
public static void main(String[] args) {
	Cons6 a=new Cons6();
	a.disp();
	Cons6 a1=new Cons6();
	a1.disp();
}
}
