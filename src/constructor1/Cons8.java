package constructor1;

public class Cons8 {
	Cons8()
	{
		System.out.println("zero arg cons");
	}
	Cons8(int a)
	{
		System.out.println("one arg cons");
	}
	Cons8(char ch,String s)
	{
		System.out.println("two arg cons");
	}
public static void main(String[] args) {
	Cons8 a=new Cons8();
	Cons8 a1=new Cons8(10);
	Cons8 a2=new Cons8('a',"jyothsna");
	new Cons8();
	new Cons8(100);
	new Cons8('g',"hyt");
	
	
}
}
