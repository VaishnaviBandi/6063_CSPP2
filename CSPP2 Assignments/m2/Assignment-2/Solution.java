import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	static void  rootsOfQuadraticEquation(int a, int b, int c) {
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
