import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
	// write your code here
		
	public ArrayList<Integer> sort() {
		// write your code here
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] tokens = input.split("\\s+");
		scanner.close();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (String token : tokens) {
			Integer number = Integer.parseInt(token);
			if (number == 0) {
				break;
			}
			numbers.add(number);
		}
		
		Collections.sort(numbers);
		numbers.remove(0);
		
		return numbers;
	}

}