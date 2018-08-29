/**.
 * { item_description }
 */
import java.util.Scanner;
/*.
	Do not modify this main function.
	*/
/**.
	 * Class for solution.
	 */
public class Solution {
	private Solution() { }
	/* Fill the main function to print the number of 7's between 1 to n*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		int ten = 10;
		int seven = 7;
		for (int i = 0; i <= n ; i++) {
			int temp = i;
			while (temp != 0) {
				if (temp % ten == seven) {
					count++;
				}
				temp = temp / ten;
			}
		}
		System.out.println(count);
	}
}
