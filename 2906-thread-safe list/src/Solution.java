import java.util.*;

public class Solution {
    public List<Integer> getList() {
        // write your code here
        return Collections.synchronizedList(new ArrayList<Integer>());
    }

}