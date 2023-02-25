import java.io.FileReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);

            // get data
            String str1 = in.nextLine();
            String strArr1[] = str1.substring(str1.indexOf("[") + 1, str1.indexOf("]")).split(",");
            for (int i = 0; i < strArr1.length; i++) {
                strArr1[i] = strArr1[i].trim();
            }

            String strArr2[] = new String[strArr1.length];

            // Validation Method Type
            Solution solution = new Solution();
            solution.copy(strArr1, strArr2);

            StringBuilder sb = new StringBuilder("[");
            for (String str : strArr2) {
                sb.append(str + ", ");
            }
            sb.delete(sb.length()-2, sb.length());
            sb.append("]");
            ps.print(sb.toString());
            ps.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}