import java.util.*;

public class Products {
    Map<String, Integer> storage;
    Map<String, Integer> sale;

    // write your code here
    public Products(Map<String, Integer> storage, Map<String, Integer> sale) {
        this.storage = storage;
        this.sale = sale;
    }

    public boolean onSale(String key, int n) {
    	int sales = 0;
    	if (storage.containsKey(key)) {
    		if (storage.get(key) >= n) {		
    			sales = n;
	    		storage.put(key, storage.get(key) - n);
	    		if (sale.containsKey(key)) {
	    			sale.put(key, sale.get(key) + n);
	    		} else {
	    			sale.put(key, n);
	    		}
    		} else {
	    		sales = storage.get(key);
	    		storage.put(key, 0);
	    		if (sale.containsKey(key)) {
	    			sale.put(key, sale.get(key) + sales);
	    		} else {
	    			sale.put(key, sales);
	    		}
    		}
    	}
    	
    	if (sales > 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public int sellOut(String key, int n) {
    	int sold = 0;
    	if (sale.containsKey(key)) {
    		if (sale.get(key) >= n) {
    			sold = n;
    			sale.put(key, sale.get(key) - n);
    		} else {
    			sold = sale.get(key);
    			sale.put(key, 0);
    		}
    	} else {
    		sold = 0;
    	}
    	
    	if (sale.containsKey(key) && sale.get(key) == 0) {
    		sale.remove(key);
    	}
    	
    	return sold;
    }
    
    public String readStorage() {
    	String output = "{";
    	int count = storage.size();
    	for (String key: storage.keySet()) {
    		count -= 1;
    		output += key + "=" + storage.get(key);
    		if (count > 0) {
    			output += ", ";
    		}
    	}
    	output += "}";
    	return output;
    }
    
    public String readSale() {
    	String output = "{";
    	int count = sale.size();
    	for (String key: sale.keySet()) {
    		count -= 1;
    		output += key + "=" + sale.get(key);
    		if (count > 0) {
    			output += ", ";
    		}
    	}
    	output += "}";
    	return output;
    }
}