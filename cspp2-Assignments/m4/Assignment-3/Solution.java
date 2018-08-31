
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String binaryToDecimal(final String s) {
        double sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int number = Character.getNumericValue(c);
            sum = sum + number * Math.pow(2, (s.length() - 1) - i); 
        }
        int temp = (int) sum;
        String res = Integer.toString(temp);
        return res;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s); //Write binaryToDecimal function
            System.out.println(res);
        }
    }
}

