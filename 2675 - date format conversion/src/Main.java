import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        try {
        	/*
            String inputPath = args[0];
            String outputPath = args[1];
            Scanner in = new Scanner(new FileReader(inputPath));
            PrintStream ps = new PrintStream(outputPath);*/

            // get data
            // String str = in.nextLine();
            String str = "2020-08-01";
            Solution solution = new Solution();
            String rs = solution.dateConversion(str);
            System.out.println(rs);
            //ps.print(rs);
            //ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}