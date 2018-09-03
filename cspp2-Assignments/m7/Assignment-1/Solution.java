import java.util.Scanner;
class InputValidator {
	String name;
	int length;
	/*Write the atrributes and methods for InputValidator*/
	public InputValidator(String input) { 
		name = input;
		length = name.length();
	}
	public boolean validateData() {
		if (length < 6) {
			return false;
		} else {
			return true;
		}
	}
}
public class Solution {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		InputValidator i = new InputValidator(input);
		System.out.println(i.validateData());

	}

}
