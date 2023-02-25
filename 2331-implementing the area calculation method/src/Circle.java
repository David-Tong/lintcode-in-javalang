public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    // write you code here
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}