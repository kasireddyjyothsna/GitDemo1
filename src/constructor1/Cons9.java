package constructor1;

public class Cons9 {
	Cons9()
	{
		
		this(10);
		System.out.println("zero arg cons");
	}
	Cons9(int a)
	{
		this('a',"jyothsna");
		System.out.println("one arg cons");
	}
	Cons9(char ch,String st)
	{
		System.out.println("two arg cons");
	}
public static void main(String[] args) {
	Cons9 a=new Cons9();
	
}
}
