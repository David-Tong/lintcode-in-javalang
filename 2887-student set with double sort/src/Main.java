import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);

		List<Student> list  = new ArrayList<>();
		//String in = sc.nextLine().trim();
		String in = "[Jimi:41, Fualy:29, July:46, Juser:28, Emperor:30, Welion:40, Jack:40, Jane:37, Sunmo:21, Welion:22, Fualy:29, Juser:22, Juser:24, Jerry:46, Juser:47, Jimi:43, Venom:21, Jerry:48, Sunmo:38, Jimi:34, Lien:41, Emperor:43, Haly:28, Jane:44, Jane:36, Venom:41, Jack:25, Haly:41, Venom:20, Beggar:49, Fualy:37, Emperor:42, Jerry:42, Jerry:42, July:39, Haly:47, Jane:33, Haly:48, July:41, Haly:28, Jimi:41, Sunmo:31, Fualy:32, Fualy:41, Jack:21, Lien:38, Lien:28, Jane:21, Lien:39, Jane:47, Orgen:40, Tom:49, Jimi:49]";
		String[] str = in.replace("[", "").replace("]", "").split(",");
		if (str.length > 0 && !"".equals(str[0])) {
			list = Arrays.stream(str).map(s -> {
				String[] stu = s.trim().split(":", 2);
				return new Student(stu[0], Integer.parseInt(stu[1]));
			}).collect(Collectors.toList());
		}
		
		System.out.println(Solution.getSortMap(list));

        //sc.close();
	}
}