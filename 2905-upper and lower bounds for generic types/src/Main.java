import java.io.FileReader;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
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
            Solution solution = new Solution();
            Class<? extends Solution> aClass = solution.getClass();
            Method[] declaredMethods = aClass.getDeclaredMethods();
            int index = 0;
            for (Method md : declaredMethods) {
                if("upperLimit".equals(md.getName())) {
                    Type[] genericParameterTypes = md.getGenericParameterTypes();
                    for (Type type : genericParameterTypes) {
                        if (type.getTypeName().contains("Number")) {
                            index++;
                        }
                    }
                    if (md.getReturnType().getName().contains("Number")) {
                        index++;
                    }
                }
                if("lowerLimit".equals(md.getName())) {
                    Type[] genericParameterTypes = md.getGenericParameterTypes();
                    for (Type type : genericParameterTypes) {
                        if (type.getTypeName().contains("String")) {
                            index++;
                        }
                    }
                    if (md.getReturnType().getName().contains("Object")) {
                        index++;
                    }
                }
            }
            if (index < 4) {
                ps.println("Verification failure.");
                return;
            }

            Info<Integer> info = new Info<>();
            info.set(200);
            Number number = solution.upperLimit(info);
            if(!number.equals(200)) {
                ps.println("Verification failure.");
                return;
            }

            Info<String> infos = new Info<>();
            infos.set("Xx");
            Object oj = solution.lowerLimit(infos);
            if(!oj.equals("Xx")) {
                ps.println("Verification failure.");
                return;
            }
            ps.println("Verification passed.");
            ps.close();
            in.close();
        } catch (Exception e) {
            ps.println("Verification failure.");
        }
    }
}