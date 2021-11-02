public class Season {
    public static String season(int month, int date) {
        if (month > 12 || month < 1 || date < 1 || date > 31) {
            return "Invalid Input";
        } else if ((month == 12 && date >= 21) || (month == 1) || (month == 2) || (month == 3 && date <= 19)) {
            return "Winter";
        } else if ((month == 3 && date >= 20)||(month == 4)||(month == 5)||(month == 6 && date <= 19)) {
            return "Spring";
        } else if ((month == 6 && date >= 20)||(month == 7)||(month == 8)||(month == 9 && date <= 21)) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
    public static void main(String[] args) {
        System.out.println(season(2, 31));
    }
}
