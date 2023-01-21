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

            // Validation Method Type
            Solution<String> solution = new Solution<>();
            Class aClass = solution.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();
            boolean check = false;
            for (Field field : declaredFields) {
                if (field.getGenericType() instanceof Type) {
                    check = true;
                }
            }
            if (!check) {
                ps.print("Verification failure.");
            }
            String str = "test";
            solution.setVar(str);
            String var = solution.getVar();

            if (str.equals(var)) {
                ps.print("Verification passed.");
            }

            ps.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}