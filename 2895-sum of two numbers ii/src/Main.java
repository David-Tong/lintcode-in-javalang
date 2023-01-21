import java.io.FileReader;
import java.io.PrintStream;
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
            String[] s = str1.trim().split(" ");

            double num1 = Double.parseDouble(s[0]);
            double num2 = Double.parseDouble(s[s.length-1]);

            // Validation Method Type
            Solution solution = new Solution();
            Class aClass = solution.getClass();
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                if (method.getName().equals("numberSummation")) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    for (Type type :genericParameterTypes) {
                        if ("Object".equals(type.getTypeName()) || "Number".equals(type.getTypeName())) {
                            throw new Exception("Please use the generic type.");
                        }
                    }
                }
            }

            Double num = solution.numberSummation(num1, num2);
            ps.print(num);
            ps.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}