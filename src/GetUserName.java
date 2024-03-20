import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // output from method
        String fname = safeinput.getNonZeroLenString(in, "What is your first name?");
        String lname = safeinput.getNonZeroLenString(in, "What is your last name?");

        System.out.println("Your name is "+fname+" "+lname);
    }
}
