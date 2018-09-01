import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
	/**
	* Empty constructor.
	*/
	private Solution() {
		//not used
	}
	/**
	 * Prints the odd composite numbers between 2 and n.
	 *
	 * @param      n     n value
	 */
	static void oddComposites(final int n) {
		// write your code here
		// for (int i = 0; i <= n; i++) {
		// 	// for (int j = 2; j <= i / 2; j++) {
		// 		if (n % i == 0) {
		// 			if (i % 3 == 0) {
		// 				System.out.println(i);
		// 			}// end if
		// 			else{
		// 				break;
		// 			}
		// 		}
		// 	}
		// }

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (i % 2 != 0) {
					System.out.println(n);
				}
			}
		}
	}
	/**
	* main method as driver program.
	* @param args is the parameter for this method
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		oddComposites(n);
	}
}

