import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            ps = new PrintStream(outputPath);

            // get data
            String s = in.nextLine();
            boolean numeric = isNumeric(s);
            if (numeric) {
                Solution<Integer> solution = new Solution<>();
                Containers<Integer> integerContainers = solution.initContainers(Integer.parseInt(s));
                ps.println(integerContainers.get());
            } else {
                Solution<String> solution = new Solution<>();
                Containers<String> stringContainers = solution.initContainers(s);
                ps.println(stringContainers.get());
            }
            ps.close();
            in.close();
        } catch (Exception e) {
			e.printStackTrace();
        }
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }
}