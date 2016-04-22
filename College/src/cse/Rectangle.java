package cse;

public class Rectangle extends GeometricObject {
private double height;
private double width;

	public Rectangle() {
	height=0.0;
	width=0.0;
	}
	public Rectangle(double height) {
		this.height=height;
	}
	public Rectangle(double height,double width) {
		this.height=height;
		this.width=width;
	}
	public Rectangle(double height,double width,String colour) {
		this.height=height;
		this.width=width;
		super.colour=colour;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return height*width;
	}
	public double getPerimeter() {
		return (2*(height+width));
	}
	public void printRectangle() {
		new Draw().putShape(2,colour,0,(int)height,(int)width);
	}
}
