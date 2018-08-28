/**
 * {Java program to find the roots of a quadratic equation}
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /*
    Do not modify this main function.
    */
    /**
     * { function_description - main function }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
     * { function to find the roots }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void rootsOfQuadraticEquation(final int a, final int b, final int c){
        double x;
        double y;
        final int four = 4;
        x = (-b + Math.sqrt((b * b) - four * a * c)) / (2 * a);
        y = (-b - Math.sqrt((b * b) - four * a * c)) / (2 * a);
        System.out.println(x + " " + y);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}
