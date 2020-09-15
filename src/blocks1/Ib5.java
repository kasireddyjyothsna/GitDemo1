package blocks1;

public class Ib5 {
	Ib5()
	{
		this(10);
		System.out.println("zero arg cons");
	}
	Ib5(int a)
	{
		System.out.println("one arg cons");
	}
	{
		System.out.println("instance blovk");
	}
	public static void main(String[] args) {
		Ib5 a=new Ib5();
		
	}
}
