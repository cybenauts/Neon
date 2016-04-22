package cse;

public class Circle extends GeometricObject {
	private double radius;
	public Circle() {
		radius=0.0;
	}
	Circle(double radius) {
		this.radius=radius;
	}
	Circle(double radius,String colour) {
		this.radius=radius;
		super.colour=colour;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public void printCircle() {
		new Draw().putShape(1,super.colour,(int)radius,0,0);
	}
}
