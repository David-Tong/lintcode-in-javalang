import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long x = sc.nextLong();
		
		ClassA a = new ClassA();
		System.out.println(a.method(s));

		ClassB b = new ClassB();
		System.out.println(b.method(x));
	}

}