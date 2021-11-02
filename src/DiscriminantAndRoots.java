import java.util.Scanner;

public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {
        double root = Math.pow(b, 2) - 4 * a * c;
        if (root > 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 real roots";
        } else if (root < 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots";
        } else {
            return a + "x^2 + " + b + "x + " + c + " has 1 real root";
        }
        // update this line so that it returns properly formatted output
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coefficients for a quadratic equation:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(roots(a, b, c));
    }
}
