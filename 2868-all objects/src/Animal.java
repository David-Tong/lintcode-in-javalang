public class Animal{
    private int age;
    private String name;

    public Animal() { }

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
    	if (obj != null) {
    		try {
	    		Animal other = (Animal) obj;
	    		if (this.age == other.age && this.name.equals(other.name)) {
	    			return true;
	    		}
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	return false;
    }

}