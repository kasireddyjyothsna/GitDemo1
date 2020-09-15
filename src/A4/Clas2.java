package A4;

import A2.Clas1;

public class Clas2 extends Clas1 {

	
	public void gm() {
	
		System.out.println("gm");
	}

	
	public void ga() {
		System.out.println("ga");
	}
	public static void main(String[] args) {
		Clas2 c=new Clas2();
		c.ga();
		c.gm();
		c.gn();
		Clas1 a=new Clas2();
		a.gm();
		a.gn();
		a.ga();
	}

}
