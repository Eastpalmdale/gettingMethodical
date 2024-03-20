import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInteger = safeinput.getInt(in, "Whats your favorite integer?");
        System.out.println("Your favorite number is "+favInteger);
        double favDouble = safeinput.getDouble(in, "Whats your favorite double?");
        System.out.println("Your favorite number is "+favDouble);
    }
}
