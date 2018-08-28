public class Factorial{
	public static void main(String[] args){
		int n = 5;
		int fact = fact(n);
		System.out.println(fact);
	}
	public static int fact(int n){
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
	}
}