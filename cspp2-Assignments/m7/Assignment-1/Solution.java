import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    private String name;
    /**.
     * { var_description }
     */
    private int length;
    /*Write the atrributes and methods for InputValidator*/
    /**.
     * Constructs the object.
     *
     * @param      string  The string
     */
    InputValidator(final String string) {
        name = string;
        length = name.length();
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        int six = 6;
        if (length < six) {
            return false;
        }
        return true;
    }
}
/**.
 * Class for solution.
 */
class Solution {
    /**.
     * { item_description: main method }
     * @param args main method
     */

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.next();
        InputValidator i = new InputValidator(string);
        System.out.println(i.validateData());

    }

}
