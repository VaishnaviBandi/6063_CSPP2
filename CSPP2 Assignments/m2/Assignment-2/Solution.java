/* java program to find the roots of a quadratic equation.*/
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /*
    Do not modify this main function.
    */
    /**
     * { function_description - main function. }
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOf(a, b, c);
    }
    /**.
     * { function to find the roots. }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void rootsOf(final int a, final int b, final int c) {
        double m;
        double n;
        final int four = 4;
        m = (-b + Math.sqrt((b * b) - four * a * c)) / (2 * a);
        n = (-b - Math.sqrt((b * b) - four * a * c)) / (2 * a);
        System.out.println(m + " " + n);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}


