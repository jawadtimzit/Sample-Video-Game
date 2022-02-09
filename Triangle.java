/*
 * Triangle Class
 * @author Jawad Timzit
 * May, 2021
 */
package jawadassignment;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * 
 */
public class Triangle extends Shape{
    private int traingle_Width;
    private Color color;
    public Triangle(int x, int y,int Width)// Constructor
    {
        super(x,y);
        traingle_Width=Width;
        color=Color.RED;
    }
    public Triangle(int x, int y,int Width,Color other)//Constructor
    {
        super(x,y);
        traingle_Width=Width;
        color=other;
    }
    public int getTraingle_Width()//Getter 
    {
        return traingle_Width;
    }

    public void setTraingle_Width(int traingle_Width)//Setter
    {
        this.traingle_Width = traingle_Width;
    }

    public Color getColor() //Getter
    {
        return color;
    }

    public void setColor(Color color)//Setter
    {
        this.color = color;
    }
    
    /*A Traingle has an Area of half of Rectangle and this triangle would be isoscles*/
    public double getArea()
    {
        return (this.traingle_Width*this.traingle_Width)/2.0;
    }
  
    @Override
     public void draw( Graphics g ){
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.
        //Dimension for Triangle
        int left = x - (this.traingle_Width / 2);// LEFT Position
        int right = x + (this.traingle_Width / 2);//Right Position
        int top = y - (this.traingle_Width / 2);// Top Position
        int bottom = y + (this.traingle_Width / 2);// Bottom Position
        int p1x=x;//TOP POINT X
        int p1y=top;//TOP POINT Y
        int p2x=left;// BOTTOM LEFT X
        int p2y=bottom;//BOTTOM LEFT Y
        int p3x=right;//BOTTOM RIGHT X
        int p3y=bottom;//BOTTOM RIGHT Y
        g.setColor(color);
        g.drawLine(p1x, p1y, p2x, p2y);// DRAW LINE from TOP bottom left
        g.drawLine(p2x, p2y, p3x, p3y);//line from bottom left to bottom right
        g.drawLine(p3x, p3y, p1x, p1y);//line from bottom right to TOP
     }
        
}
