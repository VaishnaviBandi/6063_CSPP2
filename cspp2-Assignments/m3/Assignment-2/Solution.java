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
    /* Fill the main function to print the number of 7's between 1 to n*/
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        final int ten = 10;
        final int seven = 7;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % ten == seven) {
                    count++;
                }
                temp = temp / ten;
            }
        }
        System.out.println(count);
    }
}

