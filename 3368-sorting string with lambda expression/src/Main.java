import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            String inputPath = args[0];
            String outputPath = args[1];

            Scanner sc = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);

            String[] strArr = new String[0];
            while (sc.hasNext()) {
                String in = sc.nextLine().trim();
                strArr = in.split(" ");
            }
            
            Solution solution = new Solution();
            solution.sortByLength(strArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}