// Please check code here
import java.lang.Math;

public class Student{
    final String name;
    final int age;
    
    public Student(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public double math(int a, int b) {
        if (a > b) {
            return Math.pow(2, a % 10) - Math.pow(2, b % 10);
        } else {
            return Math.sqrt(a) - Math.sqrt(b);
        }
    }
    public String toString() {
        return name + " : " + age;
    }
}