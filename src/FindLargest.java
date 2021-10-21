import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int firstNum = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        int secondNum = scan.nextInt();
        // Prompt the user for two integer variables
        if (firstNum > secondNum) {
            System.out.println(firstNum + " is larger than " + secondNum + ".");
        }
        if (firstNum < secondNum) {
            System.out.println(secondNum + " is larger than " + firstNum + ".");
        }
        if (firstNum == secondNum) {
            System.out.println(firstNum + " is equal to " + secondNum + ".");
        }
        // Create a series of if statements that will print which number is larger or if they are equal
        // Make sure your output matches the samples or the tests will not pass.
    }
}
