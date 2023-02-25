public class Square extends Shape {
    public int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    
    // write you code here
	@Override
	public double area() {
		return this.sideLength * this.sideLength;
	}
}