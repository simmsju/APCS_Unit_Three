public class LoneTeen {
    public static boolean loneTeen(int num1, int num2) {
        if ((num1 >= 13 && num1 <= 19) && !(num2 >= 13 && num2 <= 19)) {
            return true;
        } else if (!(num1 >= 13 && num1 <= 19) && (num2 >= 13 && num2 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    // In the space below, write the loneTeen method. Make sure the signature matches
    // the one given in the instructions.
}
