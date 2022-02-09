
/*
 * Pacman Class
 * @author Jawad Timzit
 * May, 2021
 */
package jawadassignment;

import java.awt.Color;
import java.awt.Graphics;


public class Pacman extends Shape {

   private int Radius;
   private int ArcStartAngle;
   private Color color;
   private int ArcEndAngle;
    public int getArcStartAngle()//Getter 
    {
        return ArcStartAngle;
    }

    public void setArcStartAngle(int ArcStartAngle)//Setter
    {
        this.ArcStartAngle = ArcStartAngle;
    }

    public int getArcEndAngle()//Getter 
    {
        return ArcEndAngle;
    }

    public void setArcEndAngle(int ArcEndAngle)//Setter
    {
        this.ArcEndAngle = ArcEndAngle;
    }
   
    public int getRadius()//Gettter 
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
    
    public Pacman(int x, int y,int Radius,int ArcStartAngle,int ArcEndAngle)//Constructor
    {
        super(x,y);
        this.Radius=Radius;
        color=Color.RED;
        this.ArcStartAngle=ArcStartAngle;
        this.ArcEndAngle=ArcEndAngle;
    }
    public Pacman(int x, int y,int Radius,Color other,int ArcStartAngle,int ArcEndAngle)//Constructor
    {
        super(x,y);
        this.Radius=Radius;
        color=other;
        this.ArcStartAngle=ArcStartAngle;
        this.ArcEndAngle=ArcEndAngle;
    }
    /*If Total angle > 180 then return full circle else half circle area */
    public double getArea()
    {
        if(getArcEndAngle()-getArcStartAngle()>=180){
        return (Math.PI*this.Radius*this.Radius);    
        }
        else
        {
            return (0.5*(Math.PI*this.Radius*this.Radius));
        }
    }
  
    @Override
     public void draw( Graphics g )
     {
        int x = getX();   // the Origin of the Circle is
        int y = getY();   // at these coordinates.
        g.setColor(color);
        g.fillArc(x, y, this.Radius, this.Radius,getArcStartAngle(),getArcEndAngle());// Draw and Fill Arc of Certain Angle
     }
    
}
