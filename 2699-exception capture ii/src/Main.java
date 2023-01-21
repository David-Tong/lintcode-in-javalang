import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);

            // get data
            String str1 = in.nextLine();
            Solution solution = new Solution();
            solution.division(str1);

            // check
            Calculators calculators = new Calculators();
            if (!calculators.getCheck()) {
                ps.print("Please call the indexation method in Calculators.");
            }
            if(calculators.getIsOpen()){
                ps.print("Please call the close method in Calculators to end the call.");
            }
            ps.print("The program is running correctly.");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}