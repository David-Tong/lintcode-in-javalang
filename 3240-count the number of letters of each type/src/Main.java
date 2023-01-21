import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            String inputPath = args[0];

            Scanner sc = new Scanner(new FileReader(inputPath));
     
            String s = sc.nextLine();
            Solution solution = new Solution();
           
            Map<String, Integer> res = solution.getLettersCounts(s);

            if (res.containsKey("Numbers")) {
                System.out.println("Numbers=" + res.get("Numbers"));
            }
            if (res.containsKey("Others")) {
                System.out.println("Others=" + res.get("Others"));
            }
            if (res.containsKey("Letters")) {
                System.out.println("Letters=" + res.get("Letters"));
            }
            if (res.containsKey("Spaces")) {
                System.out.println("Spaces=" + res.get("Spaces"));
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}