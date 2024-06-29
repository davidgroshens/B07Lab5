package lab5;

public class Square {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	public Square(Point A, Point C) {
		this.A = A;
		this.C = C;
		this.B = Point(C.x, A.y);
		this.D = Point(A.x, C.y);

	}
	
	
	public double perimeter() {
		return A.distance(B) * 4;
	}
	
	public boolean getDiagonal() {
		return A.distance(C);
	}
}