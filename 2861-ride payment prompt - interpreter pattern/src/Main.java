import java.util.*;

import expression.InterpreterPattern;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		InterpreterPattern ip = new InterpreterPattern();
		String s = ip.freeRide(sc.nextLine());
		System.out.println(s);
		sc.close();
	}

}