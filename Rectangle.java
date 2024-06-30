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
	
	 //Constructor for class: rectangle
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
	}
	//Method: perimeter - returns the perimeter of the rectangle
	public double perimeter() {
		return (A.distance(B)*2)+(B.distance(C)*2);
	}
	//method: isEquilateral - returns true or false according to whether the rectangle is equilateral(i.e square) or not
	public boolean isEquilateral() {
		if(A.distance(B)==A.distance(D)) {
			return true;
		}
		return false;
	}
}
