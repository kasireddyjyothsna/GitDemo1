package constructor1;

public class Cons5 {
	int empid;
	String ename;
	float esal;

	void disp()
	{
	System.out.println(empid);	
	System.out.println(ename);
	System.out.println(esal);
	}
public static void main(String[] args) {
	Cons5 a=new Cons5();
	a.disp();
}
}
