/**.
 * { item_description.}
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Solution {
    /*
    Do not modify this main function.
    */
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { function_description:main function. }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**.
     * { function_description }
     *
     * @param      base  The base
     * @param      expo  The expo
     *
     * @return     { description_of_the_return_value:
     * returning the result of the power }
     */
    public static long power(final int base, final int expo) {
        if (expo != 0) {
            return (base * power(base, expo - 1));
        } else {
            return 1;
        }
    }
    /*
    Need to write the power function and print the output.
    */
}
