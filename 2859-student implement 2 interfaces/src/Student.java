// write your code here

public class Student implements Interface1, Interface2 {
    String s1 = "Student implements Interface1";
    String s2 = "Student implements Interface2";

	@Override
	public String print1() {
		return s1;
	}

	@Override
	public String print2() {
		return s2;
	}
}