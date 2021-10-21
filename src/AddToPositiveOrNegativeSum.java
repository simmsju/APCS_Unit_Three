import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        // declare and instantiate a Scanner variable and object
        Scanner s = new Scanner(System.in);
        // declare and initialize variables for a positive and negative sum
        int num;
        int negSum = 0;
        int posSum = 0;
        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.print("Enter a number: ");
            num = s.nextInt();
            if (num > 0) {
                posSum += num;
            }
            if (num < 0) {
                negSum += num;
            }
        } // end of for loop
        System.out.println("The sum of the positive numbers is " + posSum);
        System.out.println("The sum of the negative numbers is " + negSum);
        // output the sums. Make sure the format matches the sample

    }
}

