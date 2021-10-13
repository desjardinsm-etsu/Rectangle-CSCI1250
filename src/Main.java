import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
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



    }
}
