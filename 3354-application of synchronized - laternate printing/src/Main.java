import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        try {
            /*
        	String inputPath = args[0];
            String outputPath = args[1];

            Scanner sc = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);

            Integer printCount = sc.nextInt();
            */
        	Integer printCount = 3;

            Object oa = new Object();
            Object ob = new Object();
            Object oc = new Object();

            Solution solutionA = new Solution("A", oc, oa, printCount);
            Solution solutionB = new Solution("B", oa, ob, printCount);
            Solution solutionC = new Solution("C", ob, oc, printCount);

            try {
                new Thread(solutionA).start();
                new Thread(solutionB).start();
                new Thread(solutionC).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }

}