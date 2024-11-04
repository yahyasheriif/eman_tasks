public class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length , double width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        double area = width * length;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2*(width + length);
        return perimeter;
    }

}