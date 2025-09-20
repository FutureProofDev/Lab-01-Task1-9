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
        double heightMetres = user_input.nextDouble();

        System.out.println("Enter your weight in pounds:");
        double weightPounds = user_input.nextDouble();

        System.out.println("Enter your jersey number:");
        int jerseyNum= user_input.nextInt();


        System.out.println("Player Name -" + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightMetres +"m");
        System.out.println("Weight - " + weightPounds + "lbs");
        System.out.println("Jersey Number - " + jerseyNum);


        // Task 2
        final double POUND = 0.45359237;
        final int METER = 100;

        double weightKG = weightPounds * POUND;
        double heightCM = heightMetres * METER;

        int weightKG_int = (int) weightKG;
        int heightCM_int = (int) heightCM;



        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightCM_int + "cm");
        System.out.println("Weight - " + weightKG_int + "lbs");
        System.out.println("Jersey Number - " + jerseyNum);


        // Task 3
        System.out.println("Player Age - " + age);

        System.out.println("After One Season:");


        age++;
        jerseyNum--;

        System.out.println("Player Age - " + age);
        System.out.println("Jersey Number - " + jerseyNum);


        //Task 4
        Boolean eligible = true;

        if ((age >= 18 && age <= 35) && (weightKG_int < 90)) {
            System.out.println("Eligible");
        }
        else {
            eligible = false;
            System.out.println("Not Eligible");
        }

        if ((age < 18) || (weightKG_int >= 90)) {
            System.out.println("Player has a problem (either too young or too heavy");
        }

        if (eligible) {
            System.out.println("Not Eligible");
        }
        else {
            System.out.println("Eligible");
        }


        // Task 5
        if (age < 20)
            System.out.println("You are a rising star!!!");

        else if (age > 20 && age < 30)
            System.out.println("You are a prime player");

        else if (age > 30)
            System.out.println("You are a Veteran, old man!!");

        // Task 6
        System.out.println("Enter a jersey number:");
        int jerseyNumCoach = user_input.nextInt();
        switch (jerseyNumCoach) {
            case 1:
                System.out.println("Player Position - Goalkeeper");
                break;

            case 2:
                System.out.println("Player Position - Defender");
                break;

            case 6:
                System.out.println("Player Position - Midfielder");
                break;

            case 11:
                System.out.println("Player Position - Winger");

            case 7:
                System.out.println("Player Position - Winger");
                break;

            case 9:
                System.out.println("Player Position - Striker");
                break;

            case 10:
                System.out.println("Player Position - Playmaker");

            default:
                System.out.println("Player position not known");

        }




        // Task 7
        System.out.println("Enter a jersey number:");
        int jerseyNumCoach1 = user_input.nextInt();
        switch (jerseyNumCoach1) {
            case 1:
                System.out.println("Player Position - Goalkeeper");
                break;

            case 5:
            case 2:
                System.out.println("Player Position - Defender");
                break;

            case 6:
                System.out.println("Player Position - Midfielder");
                break;

            case 11:
            case 7:
                System.out.println("Player Position - Winger");
                break;

            case 9:
                System.out.println("Player Position - Striker");
                break;

            case 10:
                System.out.println("Player Position - Playmaker");
                break;

            default:
                System.out.println("Player position not known");

        }

        // Task 8
        if (age < 20){
            if (weightKG_int < 80) {
                System.out.println("Starting Line Up");
            }
            else {
                System.out.println("BENCH");
            }
        }
        else {
            System.out.println("BENCH");
        }


        // Task 9
        String finalStatus = (eligible) ? "Play" : "Rest";
        System.out.println("Final Status: " + finalStatus);





    }
}
