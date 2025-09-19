import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {

        //TASK 1//

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = user_input.nextLine();

        System.out.println("Enter your age:");
        int age = user_input.nextInt();

        System.out.println("Enter your height in metres:");
        float heightMetres = user_input.nextFloat();

        System.out.println("Enter your weight in pounds:");
        float weightPounds = user_input.nextInt();

        System.out.println("Enter your jersey number:");
        int jerseyNum= user_input.nextInt();


        System.out.println("Player Name -" + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightMetres);
        System.out.println("Weight - " + weightPounds);
        System.out.println("Jersey Number - " + jerseyNum);


        final double POUND = 0.45359237;
        final int METER = 100;







    }
}
