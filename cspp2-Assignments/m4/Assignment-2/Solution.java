import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[][] b = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int[][]c = new int[row][col];
		for(int i = 0; i<row; i++){
			for (int j=0; j<col; j++ ) {
				c[i][j]= a[i][j] + b[i][j];
				System.out.println(c[i][j]);
				System.out.println();
			}
		}
			}
}