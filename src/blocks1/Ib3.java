package blocks1;

public class Ib3 {
	Ib3()
	{
		System.out.println("zero arg cons");
	}
	Ib3(int a)
	{
		System.out.println("one arg cons");
	}
	{
		System.out.println("i block 1");
	}
	{
		System.out.println("i block 2");
	}
	
	public static void main(String[] args) {
		Ib3 a=new Ib3();
		Ib3 a11=new Ib3(10);
		
	}
}
