package cse;

public class Main {
	
public static void main(String[] args) {
	
	//Parent Class
	
	/*GeometricObject go=new GeometricObject();
	go.setColour("red");
	System.out.println(go.getColour());
	*/
	
	//Circle : Child Class
	
		//Circle c= new Circle(3,"green");
	/*Circle c= new Circle();
	c.setRadius(50);
	System.out.println("Radius: "+c.getRadius());
	System.out.println("Area: "+c.getArea());
	System.out.println("Perimeter: "+c.getPerimeter());
	c.setColour("red");
	c.printCircle();*/
	 
	
	//Rectangle : Child Class
	
		//Rectangle r=new Rectangle(50,100,"yellow"); //Another Way of Passing Values
	Rectangle r=new Rectangle();
	r.setHeight(50);
	r.setWidth(100);
	System.out.println("Height: "+r.getHeight());
	System.out.println("Width: "+r.getWidth());
	System.out.println("Area: "+r.getArea());
	System.out.println("Perimeter: "+r.getPerimeter());
	r.setColour("red");
	r.printRectangle();
	
}
}
