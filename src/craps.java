import java.util.Random;
import java.util.Scanner;

public class craps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int point = 0;
        boolean done = false;

        do {
            do {
                int dieRoll = rollDie();

                System.out.println("Your roll was " + dieRoll);

                if (dieRoll == 7 || dieRoll == 11) {

                    System.out.println("You won by naturally rolling a 7 or 11!");
                    done = true;
                } else if (dieRoll == 2 || dieRoll == 3 || dieRoll == 12) {
                    System.out.println("You lost by rolling a 2,3 or 12!");
                } else {
                    point = dieRoll;
                }

            } while (!done);
        } while (safeinput.getYNConfirm(in, "Do you want to continue playing?"));


        // if sum = 7 or 11 = natural win
        // if sum = 2,3 or 12 = lose
        // else sum = points until natural win or "crapping out"(losing)
        // need yes or no, layered loop
        // need if loop for losing or winning
        // need to use yes or no to roll as well

    }
    public static int rollDie(){

        int die1;
        int die2;

        Random rnd = new Random();

        die1 = rnd.nextInt(6)+1;
        die2 = rnd.nextInt(6)+1;

        int dieRoll = die1+die2;



        return dieRoll;
    }
    public static boolean rollForPoint(int point){

        int dieRoll = rollDie();
        boolean done = false;

        System.out.println("Your die roll was "+dieRoll);

        if (dieRoll == point){
            System.out.println("You won by matching the point!");
            done = true;

        } else if (dieRoll == 7) {
            System.out.println("You lost by rolling a 7!");
            done = true;
        }
        else {
            System.out.println("Rolling the die again");
        }

        return done;
    }



}
