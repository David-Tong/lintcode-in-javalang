public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = solution.getIndexArray(args[0], args[1]);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
