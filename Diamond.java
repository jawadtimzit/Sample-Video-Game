
/*
 * Triangle Class
 * @author Jawad Timzit
 * May, 2021
 */
package jawadassignment;

import java.awt.Color;
import java.awt.Graphics;


public class Diamond extends Shape {

  private int Width;
 private int Height;

    public int getHeight()//Getter
    {
        return Height;
    }

    public void setHeight(int Height)//Setter 
    {
        this.Height = Height;
    }
    public int getWidth()//Getter 
    {
        return Width;
    }

    public void setWidth(int Width)//Setter
    {
        this.Width = Width;
    }

    public Color getColor()//Getter 
    {
        return color;
    }

    public void setColor(Color color)//Setter
    {
        this.color = color;
    }
    private Color color;
    public Diamond(int x, int y,int Width,int Height)//Constructor
    {
        super(x,y);//Calling super class for centred Position
        this.Width=Width;
        this.Height=Height;
        color=Color.RED;
    }
    public Diamond(int x, int y,int Width,int Height,Color other)//Constructor
    {
        super(x,y);
        this.Width=Width;
        this.Height=Height;
        color=other;
    }
    /*A diamond area has equal to Rectangle area which is length * Width*/
    public double getArea()
    {
        return (this.Width*this.Height);
    }
  
    @Override
     public void draw( Graphics g ){
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.
        
        // The next four ints define the coordinates of the Diamond.
        // Since x and y are at the center of the Diamond, 
        // we can find the outside of Diamond by going half the width from the x and y.
        int left = x - (this.Width / 2);
        int right = x + (this.Width / 2);
        int top = y - (this.Height / 2);
        int bottom = y + (this.Height / 2);
        int p1x=x;// Top Point X in top of midpoint 
        int p1y=top;// Top point Y
        int p2x=left;//Left Point on left of midpoint
        int p2y=y;// No change
        int p3x=right;//Right point on right of midpoint 
        int p3y=y;// No change
        int p4x=x;//Bottom Point no change x
        int p4y=bottom;// Bottom Pint Y Bottom of midpoint
        g.setColor(color);
        g.drawLine(p1x, p1y, p2x, p2y);// Drawing lines to connect point and form Diamond
        g.drawLine(p2x, p2y, p4x, p4y);
        g.drawLine(p4x, p4y, p3x, p3y);
        g.drawLine(p3x, p3y, p1x, p1y);
     }
}
