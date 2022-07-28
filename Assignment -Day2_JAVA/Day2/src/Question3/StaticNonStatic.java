package Question3;

public class StaticNonStatic {
	int a=20;
	int b=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=40;
		int Total = a+b;
		System.out.println("Total Addition in (public static void main)is  " +  Total);
		StaticNonStatic total =new StaticNonStatic();
		int Summation = total.a+total.b;
		System.out.println("Total Addition in StaticNonStatic  "+Summation);
	}

}
