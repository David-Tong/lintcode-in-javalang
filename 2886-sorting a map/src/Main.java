import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		String in = sc.nextLine().trim();
		String[] str = in.replace("[", "").replace("]", "").split(",");
		
		for (String s : str) {
			String[] entry = s.trim().split(":", 2);
			map.put(entry[0], Integer.parseInt(entry[1]));
		}

		System.out.println(Solution.sortMap(map));

        sc.close();
	}
}