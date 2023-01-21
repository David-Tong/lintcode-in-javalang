import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // read data from console
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	boolean[] A = new boolean[n];
    	while (sc.hasNext()) {
    		int index = sc.nextInt();
    		A[index - 1] = true;
    	}
    	sc.close();
    
        // output the answer to the console according to the
    	// requirements of the question
    	for (int i=0; i<n; i++) {
    		if (!A[i]) {
    			System.out.print(i + 1);
    			break;
    		}
    	}
    }
}
