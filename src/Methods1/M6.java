package Methods1;

public class M6 {
	int x=10;
	int y=20;
	void m1(int x,int y)
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
public static void main(String[] args) {
	M6 m=new M6();
	m.m1(100, 200);
}
}
