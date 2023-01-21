import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);

            // get data
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String strArr1[] = str1.substring(str1.indexOf("[") + 1, str1.indexOf("]")).split(",");
            String strArr2[] = str2.substring(str2.indexOf("[") + 1, str2.indexOf("]")).split(",");
            int arr1[] = new int[strArr1.length];
            int arr2[] = new int[strArr2.length];
            for (int i = 0; i < arr1.length; i++) {
                String num = strArr1[i].trim();
                if (num.length() <= 0) continue;
                arr1[i] = Integer.parseInt(num);
            }
            for (int i = 0; i < arr2.length; i++) {
                String num = strArr2[i].trim();
                if (num.length() <= 0) continue;
                arr2[i] = Integer.parseInt(num);
            }

            Solution solution = new Solution();
            int[] rs = solution.replacement(arr1, arr2);
            StringBuilder stringBuilder = new StringBuilder("[");
            for (int i = 0; i < rs.length; i++) {
                if (i != 0) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(rs[i]);
                if (i != rs.length -1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
            ps.print(stringBuilder.toString());
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}