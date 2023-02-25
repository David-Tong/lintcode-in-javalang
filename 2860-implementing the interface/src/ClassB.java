//write your code here
public class ClassB implements InterfaceA {
	
	public long method(long n) {
		long factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
