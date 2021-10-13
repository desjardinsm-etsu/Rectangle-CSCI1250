public class Rectangle
{
    private double length;
    private double width;

    //default paper size is 8.5X11
    public Rectangle()
    {
        this.length = 8.5;
        this.width = 11;
    }
    //give me the numbers for length and width
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    //give me string numbers to use
    public Rectangle(String length, String width)
    {
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }
    //Give me the name of the paper you want to use
    public Rectangle(String name)
    {
        if(name.equals("Standard"))
        {
            this.length = 8.5;
            this.width = 11;
        }
        else if (name.equals("Legal"))
        {
            this.length = 8.5;
            this.width = 14;
        }
        else if(name.equals("Tabloid"))
        {
            this.length = 11;
            this.width = 22;
        }
    }


    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }


    private void setLength(double length)
    {
        this.length = length;
    }
    

    private void setWidth(double width)
    {
        this.width = width;
    }


    public static  String getBrand()
    {
        return brand;
    }


    private static final String brand = "Desjardins LLC";
    @Override
    public String toString()
    {
        return "This rectangle is  " + length + " X " + width + " by " + brand + ".";
    }
}