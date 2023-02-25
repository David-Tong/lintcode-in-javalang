import java.io.FileReader;
import java.io.PrintStream;
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
                  String str2 = in.nextLine();
                  String strArr1[] = str1.split(" ");
                  String strArr2[] = str2.split(" ");
                  Object oj1 = null;
                  Object oj2 = null;
                   if ("student".equals(strArr1[0].toLowerCase())) {
                        oj1 = new Student(strArr1[1], Integer.parseInt(strArr1[2]));
                  }
                  if ("student".equals(strArr2[0].toLowerCase())) {
                        oj2 = new Student(strArr2[1], Integer.parseInt(strArr2[2]));
                  }
                  if("teacher".equals(strArr1[0].toLowerCase())) {
                        oj1 = new Teacher(strArr1[1], Integer.parseInt(strArr1[2]));
                  }
                  if("teacher".equals(strArr2[0].toLowerCase())) {
                        oj2 = new Teacher(strArr2[1], Integer.parseInt(strArr2[2]));
                  }
                  Solution solution = new Solution();
                  boolean rs = solution.determineUserName(oj1, oj2);
                  ps.print(rs);
                  ps.close();
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }

}