package A3;

import A1.Inter1;

public class Clas3 implements Inter1 {
	public void gn()
	
	{
		System.out.println("gudnigh");
	}
	public void gm()
	{
		System.out.println("good morning");
	}
	public void ga()
	{
		System.out.println("gud afternoon");
	}
	public static void main(String[] args) {
		Clas3 c=new Clas3();
		c.gn();
		c.gm();
		c.ga();
	
	Inter1 i=new Clas3();
	i.ga();
	i.gm();
	i.gn();
	
	
	}

}
