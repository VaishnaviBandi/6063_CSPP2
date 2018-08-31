//java program to reverse a string.
import java.util.Scanner;
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
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value: string }
     */
    public static String reverseString(final String s) {
// char[] word = new char[s.length()];
        String str = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            str = str + String.valueOf(s.charAt(i));
        }
        return str;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);

    }
}
