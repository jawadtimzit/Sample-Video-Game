/*
 * Triangle Class
 * @author Jawad Timzit
 * May, 2021
 */

package jawadassignment;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {

     private int Radius;// Only need for Radius
 private Color color;
    public int getRadius()//Getter
    {
        return Radius;
    }

    public void setRadius(int Radius)//Setter
    {
        this.Radius = Radius;
    }

    public Color getColor()//Getter 
    {
        return color;
    }

    public void setColor(Color color)//Setter
    {
        this.color = color;
    }
   
    public Circle(int x, int y,int Radius)//Constructor
    {
        super(x,y);
        this.Radius=Radius;
        color=Color.RED;
    }
    public Circle(int x, int y,int Radius,Color other)//Constructor
    {
        super(x,y);
        this.Radius=Radius;
        color=other;
    }
    /*A Circle area is pie* square(radius) so i have two circle overlapping i also consider this area*/
    public double getArea()
    {
        return (Math.PI*this.Radius*this.Radius);
    }
  
    @Override
     public void draw( Graphics g ){
        int x = getX();   // the Origin of the Circle is
        int y = getY();   // at these coordinates.
        g.setColor(color);
        
       
        g.drawOval(x, y, this.Radius, this.Radius);// Original Circle
         g.drawOval(x-(int)this.Radius/2, y+(int)((float)this.Radius/2.2), this.Radius*2, this.Radius/3);// Ring of Circle
     }
    
}
