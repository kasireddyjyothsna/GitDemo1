package covidjavaratan01;

public class Static3 {
	static int i=10;
	
public static void main(String[] args) {
	System.out.println(i);
	System.out.println(Static3.i);
	Static3 a=new Static3();
	System.out.println(a.i);
}
}
