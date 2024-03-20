import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes;

        int hour;

        int year;

        int month;

        int day;

        String prompt = safeinput.getNonZeroLenString(in, "Name...");

        safeinput.prettyHeader(prompt);

        year = safeinput.getRangedInt(in, "\nYear: ", 1955, 2010);

        month = safeinput.getRangedInt(in, "\nMonth: ", 1, 12);

        hour = safeinput.getRangedInt(in, "\nHour: ", 1, 24);

        minutes = safeinput.getRangedInt(in, "\nMonth: ", 1, 60);

        
        switch (month) {
            case 9:
            case 4:
            case 6:
            case 11:
                day = safeinput.getRangedInt(in, "Day: ", 1, 30);
                break;
            case 2:
                day = safeinput.getRangedInt(in, "Day: ", 1, 28);
                break;
            default:
                day = safeinput.getRangedInt(in, "Day: ", 1, 31);
                break;
        }

        System.out.println("Year: "+year+"\nmonth: "+month+"\nday: "+day+"\nhour born: "+hour+"\nminute born: "+minutes);

    }
}
