import java.util.*;

public class Solution {
    public static Map<Student, Integer> getSortMap(List<Student> list) {
        // write your code here
    	//System.out.println(list.size());
    	
    	Map<String, Integer> store = new HashMap<String, Integer>();
    	List<Integer> toRemove = new LinkedList<Integer>();
    	for (int index=0; index<list.size(); index++) {
    		String key = list.get(index).toString();
    		if (store.containsKey(key)) {
    			toRemove.add(store.get(key));
    		} 
    		store.put(key, index);
    	}
    	
    	List<Student> newList = new LinkedList<Student>();
    	for (int index=0; index<list.size(); index++) {
    		if (! toRemove.contains(index)) {
    			newList.add(list.get(index));
    		}
    	}
    	
        Collections.sort(newList, new Comparator<Student>() {
        	@Override
        	public int compare(Student s1, Student s2) {
        		if (s1.age != s2.age) {
        			return s1.age - s2.age;
        		} else {
        			return s1.name.compareTo(s2.name);
        		}
        	}
        });
        
        Map<Student, Integer> ans = new LinkedHashMap<Student, Integer>();
        for (Student s : newList) {
        	String key = s.toString();
        	ans.put(s, store.get(key));
        }
        
        //System.out.println(ans.size());
        
        return ans;
    }
}