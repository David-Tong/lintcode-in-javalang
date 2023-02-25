import java.io.FileReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            ps = new PrintStream(outputPath);

            // get data

            // Validation Method Type
            Solution<String> solution = new Solution(String.class, 3);
            Class<? extends Solution> aClass = solution.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();
            boolean check = false;
            for (Field a : declaredFields) {
                if(a.getGenericType() instanceof Type){
                    check = true;
                }
            }
            if(!check) {
                ps.println("Verification failure.");
                return;
            }
            Integer arrNum[] = new Integer[]{1, 2, 3};
            String arrStr[] = new String[]{"a", "b", "c"};
            Object addObj[] = new Object[]{"x", 1, "z"};

            boolean rs = false;
            solution.initArrData(arrStr);
            String[] arr = solution.getArr();
            boolean c1 = checkRs(arr, arrStr);

            Solution<Integer> solutions = new Solution(Integer.class, 3);
            solutions.initArrData(arrNum);
            Integer[] arr1 = solutions.getArr();
            boolean c2 = checkRs(arr1, arrNum);

            Solution<Object> solution1 = new Solution(Object.class, 3);
            solution1.initArrData(addObj);
            Object[] arr2 = solution1.getArr();
            boolean c3 = checkRs(arr2, addObj);

            if(c1 && c2 && c3) {
                ps.println("Verification passed.");
            } else {
                ps.println("Verification failure.");
            }

            ps.close();
            in.close();
        } catch (Exception e) {
            ps.print("Verification failure.");
        }
    }

    public static boolean checkRs(Object[] oj1, Object[] oj2){
        if(oj1.length != oj2.length) return false;
        for (int i =0; i < oj1.length; i++) {
            if (oj1[i] != oj2[i]) return false;
        }
        return true;
    }
}