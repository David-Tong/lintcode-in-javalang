public class Main {
    public static void main(String[] args) {
        try {
            String str = args[0];
            int index = Integer.parseInt(str);
            if (index == 1) {
                new Solution();
            } else {
                System.out.println(Solution.str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}