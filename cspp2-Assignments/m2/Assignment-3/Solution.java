import java.util.Scanner;
/**
 * { item_description }.
 */

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * {This is the function where we write take the inputs}.
     *
     * @param      args  type is string
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
     * {recursion function for power}.
     *
     * @param      base     {type int }.
     * @param      expo     {type int}.
     *
     * @return     { returns the power }.
     */
    public static long power(final int base, final int expo) {
        if (expo != 0) {
            return (base * power(base, expo - 1));
        } else {
            return 1;
        }
    }
}
