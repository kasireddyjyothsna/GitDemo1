package constructor1;

public class Cons3 {
	Cons3()
	
	{
		System.out.println("zero arg cons");
	}
	Cons3(int a)
	{System.out.println("1 arg cons");}
public static void main(String[] args) {
	Cons3 a=new Cons3();
	Cons3 a1=new Cons3(10);
}
}
