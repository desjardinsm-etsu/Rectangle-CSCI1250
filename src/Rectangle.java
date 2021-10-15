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


    public void flip()
    {
        double tempWidth = length;
        length = width;
        width = tempWidth;
    }

    public void cutInHalf()
    {
        length /= 2;
        width /= 2;
    }

    public double area()
    {
        //double area = length * width;
        //return area;

        return length * width;
        //the most supper awesom method after you do area
        //this will never happen
    }

    public double perimeter()
    {
        return (2 * length) + (2 * width);
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }


    public void setLength(double length)
    {
        this.length = length;
    }
    

    public void setWidth(double width)
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