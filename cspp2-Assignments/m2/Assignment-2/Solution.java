
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor
    }
    /**
     * { This is the function where we take the inputs }.
     *
     * @param      args  is type string
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /**
     * {    Need to write the rootsOfQuadraticEquation.
     *      function and print the output. }.
     *
     * @param      a     { type int }
     * @param      b     { type int }
     * @param      c     { type int }
     */
    public static void  roots(final int a, final int b, final int c) {
        double m;
        double n;
        final int four = 4;
        m = (-b + Math.sqrt((b * b) - four * a * c)) / (2 * a);

        n = (-b - Math.sqrt((b * b) - four * a * c)) / (2 * a);
        System.out.println(m + " " + n);
    }
}
