import java.lang.reflect.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		int i = 0;
		while (sc.hasNext()) {
			String in = sc.nextLine().trim();
			String[] str = in.split(" ", 2);
			list.add(new Person(str[0], Integer.parseInt(str[1]), i++));
		}

		Solution solution = new Solution();
		solution.priority(list);

        sc.close();
	}
}