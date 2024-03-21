import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;

        String userSSN = safeinput.getRegExString(in, "Please input your SSN.", "\\d{3}-\\d{2}-\\d{4}");
        String userStudentMNumber = safeinput.getRegExString(in, "Please input your student ID number.", "(M|m)\\d{5}");
        String userMenuChoice = safeinput.getRegExString(in, "Please enter your choice from the menu.", "[OoSsVvQq]");

    }
}