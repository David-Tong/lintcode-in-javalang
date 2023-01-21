import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		LinkedList<String> linkedList = new LinkedList<>();
		
		for (int i = 0; i < 6; i++) {
			linkedList.add(sc.next());
		}
		
		LinkedList<String> lis = Solution.Weighting(linkedList);

		Iterator<String> it = lis.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		sc.close();
	}
}