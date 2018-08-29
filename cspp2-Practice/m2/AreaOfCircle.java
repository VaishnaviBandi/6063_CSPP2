import java.util.Scanner;
public class AreaOfCircle{
	static double pi(){
		return 3.14;
	}
	static double area(double r){
		double area = pi() * r * r;
		return area;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		// double a = area(radius);
		System.out.println(area(radius));
	}
}