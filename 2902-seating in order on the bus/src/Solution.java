import java.util.*;

public class Solution {
    public void priority(List<Person> list) {
        // write your code here
        Comparator<Person> comparator = new Comparator<Person>() {
        	@Override
        	public int compare(Person p1, Person p2) {
        		// check age
        		if (p1.age < 5 || p1.age > 60) {
        			if (p2.age < 5 || p2.age > 60) {
        				return p1.number - p2.number;
        			} else {
        				return -1;
        			}
        		} else {
        			if (p2.age < 5 || p2.age > 60) {
        				return 1;
        			} else {
        				return p1.number - p2.number;
        			}
        		}
        	}
        };
        
        PriorityQueue<Person> pq = new PriorityQueue<Person>(comparator);
        
        for (Person p : list) {
        	pq.add(p);
        }
        
        while (!pq.isEmpty()) {
        	System.out.println(pq.remove());
        }
    }

}