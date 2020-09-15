package constructor1;

public class Cons7 {
	int eid;
	String ename;
	float esal;
	
	Cons7(int eid,String ename,float esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void disp()

	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
public static void main(String[] args) {
	Cons7 a=new Cons7(1,"jyothsna",10000.0f);
	a.disp();
	Cons7 a1=new Cons7(2,"jy",20000.0f);
	a1.disp();
	Cons7 a2=new Cons7(3,"jenny",30000.0f);
	a2.disp();
}
}
