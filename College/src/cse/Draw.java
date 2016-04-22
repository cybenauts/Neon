package cse;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Field;

import javax.swing.JFrame;

public class Draw extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public int check;
	int r,h,w;
	String c="black";
	 
	public Draw() {
		setTitle("Geometric Shapes");
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void putShape(int i,String co,int ra,int he,int wi) {
		check=i;
		c=co;
		r=ra; h=he; w=wi;
	}
	
	//Autocall
	public void paint(Graphics g) {
		Color cuz;//For Custom colors
		try { //Can't Throw Exceptions
		    
			Field field = Color.class.getField(c);//Passing Passed colour from GeoObj class
		    cuz = (Color)field.get(null);

		    } 
		catch (Exception e) {
		    cuz = null; // Not defined
		   }
		
		if(check==1) {
			g.setColor(cuz);//for custom color otherwise use g.setColor(Color.green);
			g.drawOval(175, 175, r, r);
		}
		
		else if(check==2) {
			g.setColor(cuz);
			g.drawRect(140, 175, w, h);
			//g.fillRect(140, 175, w, h); //filled rectangle
		}
	}

}
