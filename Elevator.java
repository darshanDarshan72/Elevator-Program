import java.util.Scanner;
public class Elevator
{
    static int floor = 0,person = 0,choice1;
    public static void main(String args[])
    {
        floor = (int)(Math.random()*10+1);
        Scanner in = new Scanner(System.in);

        System.out.println("Current Floor : " + floor);

        System.out.print("Floors \n1 2 3 \n4 5 6 \n7 8 9 \n10\n");

        System.out.println("Enter Floor Number : ");

        choice1 = in.nextInt();

        if(floor == choice1)
        {
            System.out.println("Your on the floor, Please Exit.");
        }
        else if(floor > choice1)
        {
            down();
        }
        else
        {
            up();
        }

        in.close();


    }

    public static void up()
    {
        System.out.print("Elevator is going up : ");
        for(; floor <= choice1; floor++)
        {
            System.out.print(floor + " ");
        }
        System.out.println("\nElevator is arrived at floor : " + choice1);
    }

    public static void down()
    {
        System.out.print("Elevator is going down : ");
        for(; floor >= choice1; floor--)
        {
            System.out.print(floor + " ");
        }
        System.out.println("\nElevator is arrived at floor : " + choice1);
    }
}