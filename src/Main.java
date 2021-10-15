import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*
        //String name = "Mathew";

        String name = new String("Mathew");

        Scanner kb = new Scanner(System.in);

        Rectangle paper = new Rectangle();
        Rectangle maskLid = new Rectangle(4, 8);
        Rectangle paper2 = new Rectangle("8.5", "11");
        Rectangle paper3 = new Rectangle("Tabloid");



        System.out.println(paper.getLength());
        System.out.println(paper.getWidth());

       // paper.setWidth(paper.getWidth() / 2);



        System.out.println(paper.getLength());
        System.out.println(paper.getWidth());


        System.out.println(paper.getLength());
        System.out.println(paper.getWidth());

        //paper.setWidth(11);

        System.out.println(paper.getLength());
        System.out.println(paper.getWidth());
        */

        /*
        char[] name = {'J', 'A', 'N', 'E'};
        char[] name3 = new char[4];


       // char[] name2 = name;

        //name2[0] = 'B';

        for (int i = 0; i < name.length; i++)
        {
            name3[i] = name[i];
        }

        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
            System.out.println(name3[i]);

        }

        name3[0] = 'B';

        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
            System.out.println(name3[i]);

        }
*/


        Scanner kb = new Scanner(System.in);

        System.out.print("How many rectangles do you want to create? ");
        int numRec = kb.nextInt();

        Rectangle[] rectangles = new Rectangle[numRec];

        for (int i = 0; i < rectangles.length; i++)
        {
            rectangles[i] = new Rectangle();
        }

        for (Rectangle r: rectangles)
        {
            System.out.println(r.area());
        }

        System.out.print("Which rectangle do you want to change the sizes too? ");
        int whichTangle = kb.nextInt();

        while (whichTangle < 1 || whichTangle > rectangles.length)
        {
            System.out.println("Needs to be between 1 and " + rectangles.length);
            System.out.print("Which rectangle do you want to change the sizes too? ");
            whichTangle = kb.nextInt();

        }

        System.out.print("What length do you want rectangle " + whichTangle + " to be? ");
        rectangles[whichTangle - 1].setLength(kb.nextDouble());

        System.out.print("What width do you want rectangle " + whichTangle + " to be? ");
        rectangles[whichTangle - 1].setWidth(kb.nextDouble());

        for (Rectangle r: rectangles)
        {
            System.out.println(r.area());
        }






    }
}
