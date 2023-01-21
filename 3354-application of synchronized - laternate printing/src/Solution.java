public class Solution implements Runnable {

    private String name;

    private Object prev;

    private Object self;

    private Integer printCount;

    public Solution(String name, Object prev, Object self, Integer printCount) {
        this.name = name;
        this.prev = prev;
        this.self = self;
        this.printCount = printCount;
    }

    @Override
    public void run() {
        //  -- write your code here --
    	while (this.printCount > 0) { 
	    	synchronized(this.prev) {
	    		synchronized(this.self) {
	    			System.out.print(this.name);
	    			this.printCount -= 1;
	    			this.self.notifyAll();
	    		}
	    		try {
	    			if (this.printCount == 0) {
	    				this.prev.notifyAll();
	    			} else {
	    				this.prev.wait();
	    			}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	}
    	}
    }
}