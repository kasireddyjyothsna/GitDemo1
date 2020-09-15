package blocks1;

public class Ib2 {
	Ib2()
	{
		System.out.println("zero arg cons");
	}
	Ib2(int a)
	{
		System.out.println("one arg cons");
	}
	Ib2(char ch,String st)
	{
		System.out.println("two arg cons");
	}
	{
		System.out.println("instance block");
	}
public static void main(String[] args) {
	Ib2 a=new Ib2();
	Ib2 a1=new Ib2(10);
	Ib2 a2=new Ib2('a',"jyothna");
	
}
}
