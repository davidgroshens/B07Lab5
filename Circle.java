import java.lang.Math;

public class Circle {
	Point A;
	double radius;
	
	public Circle(Point A, double radius) {
		this.A = A;
		this.radius = radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
}