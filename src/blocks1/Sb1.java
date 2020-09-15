package blocks1;

public class Sb1 {
	
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	static 
	{
		System.out.println("static block 1");
	}
	static 
	{
		System.out.println("static block 2");
	}
	Sb1()
	{
	System.out.println("zero arg cons");
	}
	Sb1(int a)
	{
	System.out.println("one arg cons");
	}
	
public static void main(String[] args) {
	Sb1 a=new Sb1();
	Sb1 a1=new Sb1(10);
	
}
}
