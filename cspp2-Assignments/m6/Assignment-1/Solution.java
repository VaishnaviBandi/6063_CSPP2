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

		for (int i = 3; i <= n; i++) {
			int c=0;
			for (int j= i; j>=1; j--){
				if(i%j==0){
					c++;
				}
			}
				if (c % 2 != 0) {
					if(i%2!=0){
						System.out.println(i);
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