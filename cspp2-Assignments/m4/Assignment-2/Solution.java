/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public class Solution {
	/**.
	 * Constructs the object.
	 */
	private Solution() { }
	/* Fill the main function to print resultant of addition of matrices*/
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowa = sc.nextInt();
		int cola = sc.nextInt();
		int[][] a = new int[rowa][cola];
		for (int i = 0; i < rowa; i++) {
			for (int j = 0; j < cola; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int rowb = sc.nextInt();
		int colb = sc.nextInt();
		int[][] b = new int[rowb][colb];
		for (int i = 0; i < rowb; i++) {
			for (int j = 0; j < colb; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		if (rowa != rowb && cola != colb) {
			System.out.println("not possible");
		} else {
			int[][]c = new int[rowa][cola];
			for (int i = 0; i < rowb; i++) {
				for (int j = 0; j < colb; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			for (int i = 0; i < rowb; i++) {
				for (int j = 0; j < colb; j++) {
					if(j == colb-1)
					{
						System.out.println(c[i][j]);
					}else {
						System.out.print(c[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}
}