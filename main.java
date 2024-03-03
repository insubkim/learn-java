import java.util.Scanner;
public class main {

    public static boolean is_leap_year(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        try {
            int year = Integer.parseInt((line));
            if (is_leap_year(year)) System.out.println("윤년!");
            else System.out.println("평년!");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
 }
