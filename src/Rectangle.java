public class Rectangle
{
    private static final String brand = "Desjardins LLC";
    private double length;
    private double width;
    
    public Rectangle()
    {
        this.length = 10;
        this.width = 20;
    }
    
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public static  String getBrand()
    {
        return brand;
    }
    
    @Override
    public String toString()
    {
        return "This rectangle is  " + length + " X " + width + " by " + brand + ".";
    }
}