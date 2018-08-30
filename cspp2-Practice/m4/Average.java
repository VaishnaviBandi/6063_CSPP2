import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
		int size, sum = 0;
		float avg;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		avg = (float)sum / size;
		System.out.println(avg);

	}
}

