
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{
	static long binaryToDecimal(String s){
		long res = Long.parseLong(s,2);
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			long res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}

}
