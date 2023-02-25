public class Solution {

    public boolean determineUserName(Object object1, Object object2) {
        if (object1 instanceof Student && object2 instanceof Student) {
        	Student student1 = (Student) object1;
        	Student student2 = (Student) object2;
        	if (student1.getName().equals(student2.getName())) {
        		if (student1.getAge() != student2.getAge()) {
        			return true;
        		}
        	}
        }
        
        if (object1 instanceof Teacher && object2 instanceof Teacher) {
        	Teacher teacher1 = (Teacher) object1;
        	Teacher teacher2 = (Teacher) object2;
        	if (teacher1.getName().equals(teacher2.getName())) {
        		if (teacher1.getAge() != teacher2.getAge()) {
        			return true;
        		}
        	}
        }
        
        return false;
    }
}

