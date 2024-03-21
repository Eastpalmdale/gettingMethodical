import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double itemCost = 0;
        double itemCostTotal=0;
        boolean doneOrNot = false;

        // loop
        do {
            itemCost = safeinput.getRangedDouble(in, "Enter your item cost between 50 cents and $9.99.", .5, 9.99);

            itemCostTotal = itemCostTotal + itemCost;

            doneOrNot = safeinput.getYNConfirm(in, "Are you done shopping?");

        }while (!doneOrNot);
        System.out.println("Your total cost is "+itemCostTotal);

    }
}
