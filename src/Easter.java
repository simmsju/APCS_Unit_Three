import java.util.Scanner;

public class Easter {
    public static Boolean isValidYear(int year) {
        if (year >= 1900 && year <= 2099) {
            return true;
        } else {
            return false;
        }
    }
    public static String dateOfEaster(int year) {
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2*b + 4*c + 6*d + 5) % 7;
        int easterDay = 22 + d + e;

        if (year == 1954 || year == 1981 || year == 2049 || year == 2076) {
            easterDay -= 7;
        }

        if (isValidYear(year)) {
            if (easterDay > 31) {
                easterDay -= 31;
                return "In " + year + " Easter is on April " + easterDay;
            } else {
                return "In " + year + " Easter is on March " + easterDay;
            }
        } else {
            return "You have entered an invalid year";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a year between 1900 and 2099");
        int year = s.nextInt();
        System.out.println(dateOfEaster(year));
    }
}
