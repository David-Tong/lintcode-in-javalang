public class Solution {

    public void division(Object num) throws Exception {
        // -- write your code here --
       Calculators calculators = new Calculators();
       calculators.open();
       try {
    	   calculators.indexation(num);
       } catch (Exception e) {
    	   e.printStackTrace();
       } finally {
    	   calculators.close();
       }
    }
}