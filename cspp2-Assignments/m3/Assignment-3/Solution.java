/**.
 * { item_description }
 */
import java.util.Scanner;
/*.
    Do not modify this main function.
    */
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() { }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
    }
    /*.
    Need to write the gcd function and print the output.
    */
    /**.
     * { function_description }
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     */
    public static void gcd(final int n1, final int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

