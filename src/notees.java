import java.util.Scanner;

public class notees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    safeinput.prettyHeader("life is an illusion");


        String fname = safeinput.getNonZeroLenString(in, "What is your first name?");
        String lname = safeinput.getNonZeroLenString(in, "What is your last name?");

        System.out.println("Your name is "+fname+" "+lname);
    }
}
