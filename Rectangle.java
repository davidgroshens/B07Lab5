package lab4;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	/*
	 * A--------------B
	 * |              |
	 * |              |
	 * D--------------C
	 */
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
	}

	public double perimeter() {
		return (A.distance(B)*2)+(B.distance(C)*2);
	}

	public boolean isEquilateral() {
		if(A.distance(B)==A.distance(D)) {
			return true;
		}
		return false;
	}
}
