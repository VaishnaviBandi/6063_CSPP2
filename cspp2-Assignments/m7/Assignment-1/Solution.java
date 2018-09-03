import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    private String name;
    private int length;
    /*Write the atrributes and methods for InputValidator*/
    /**
     * Constructs the object.
     *
     * @param      string  The string
     */
    public InputValidator(String string) {
        name = string;
        length = name.length();
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        int six = 6;
        if (length < 6) {
            return false;
        } else {
            return true;
        }
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * { item_description: main method }
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String string = s.next();
        InputValidator i = new InputValidator(string);
        System.out.println(i.validateData());

    }

}
