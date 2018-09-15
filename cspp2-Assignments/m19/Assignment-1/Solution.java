import java.util.Scanner;
import java.util.ArrayList;
// class Quiz {
// String question;
// int score;
// int maxMarks;
// int questionCount;
// Quiz() {

// }
// Quiz(String question, int score, int maxMarks, int questionCount) {
// 	this.question = question;
// 	this.score = score;
// 	this.maxMarks = maxMarks;
// 	this.questionCount = questionCount;
// }
class Quiz {
	String[] questions = new String[10];
	String[] choices = new String[10];;
	String[] ans = new String[10];;
	String[] maxMarks = new String[10];;
	String[] penality = new String[10];;
	String[] responses = new String[10];
	int count = 0;
}

/**
 * Solution class for code-eval.
 */
public final class Solution {
	/**
	* Constructs the object.
	*/
	private Solution() {
		// leave this blank
	}
	/**
	 * main function to execute test cases.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		// instantiate this Quiz
		Quiz q = new Quiz();
		// code to read the test cases input file
		Scanner s = new Scanner(System.in);
		// check if there is one more line to process
		while (s.hasNext()) {
			// read the line
			String line = s.nextLine();
			// split the line using space
			String[] tokens = line.split(" ");
			// based on the list operation invoke the corresponding method
			switch (tokens[0]) {
			case "LOAD_QUESTIONS":
				System.out.println("|----------------|");
				System.out.println("| Load Questions |");
				System.out.println("|----------------|");
				loadQuestions(s, q, Integer.parseInt(tokens[1]));
				break;
			case "START_QUIZ":
				System.out.println("|------------|");
				System.out.println("| Start Quiz |");
				System.out.println("|------------|");
				startQuiz(s, q, Integer.parseInt(tokens[1]));
				break;
			case "SCORE_REPORT":
				System.out.println("|--------------|");
				System.out.println("| Score Report |");
				System.out.println("|--------------|");
				displayScore(q);
				break;
			default:
				break;
			}
		}
	}
	/**
	 * Loads questions.
	 *
	 * @param      s              The scanner object for user input
	 * @param      quiz           The quiz object
	 * @param      questionCount  The question count
	 */
	public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
		// write your code here to read the questions from the console
		// tokenize the question line and create the question object
		// add the question objects to the quiz class
		int  count = 0;
		// Scanner s = new Scanner(System.in);
		while (count < questionCount) {
			String input = s.nextLine();
			String inputs[] = input.split(":");
			quiz.questions[count] = inputs[0];
			quiz.choices[count] = inputs[1];
			quiz.ans[count] = inputs[2];
			quiz.maxMarks[count] = inputs[3];
			quiz.penality[count] = inputs[4];
			count += 1;
			quiz.count += 1;
		}
		System.out.println(questionCount + " are added to the quiz");

	}

	/**
	 * Starts a quiz.
	 *
	 * @param      s            The scanner object for user input
	 * @param      quiz         The quiz object
	 * @param      answerCount  The answer count
	 */
	public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
		// write your code here to display the quiz questions
		// read the user responses from the console
		// store the user respones in the quiz object
		int c = 0;
		Scanner scan = s;
		while (c < answerCount) {
			System.out.println("question text " + (c+ 1) + " (" + quiz.maxMarks[c] + ")");
			String[] options = quiz.choices[c].split(",");
			int count1 = 1;
			for (String option : options) {
				if (count1 == 4) {
					System.out.println(option);
				} else {
					System.out.print(option + "\t");
				}
				count1++;
			}
			String answer = scan.nextLine();
			String[] res = answer.split(" ");
			quiz.responses[c] = res[1];
			c += 1;
		}
	}

	/**
	 * Displays the score report
	 *
	 * @param      quiz     The quiz object
	 */
	public static void displayScore(final Quiz quiz) {
		// write your code here to display the score report
		// for (int i = 0; i < questions; i++) {
		// 	if (quiz.answer == ) {
		// 		System.out.println("Correct Answer! - Marks Awarded:" + );
		// 	}
		// }
		int temp = 0;
		for (int i = 0; i < (quiz.count); i++) {
			int ans = 0;
			int penality = 0;
			if (quiz.ans[i].equals(quiz.responses[i])) {
				ans = Integer.parseInt(quiz.maxMarks[i]);
				System.out.println("Correct Answer! - Marks Awarded: " + quiz.maxMarks[i]);
			} else {
				penality = Integer.parseInt(quiz.penality[i]);
				System.out.println("Wrong Answer! - Penalty: " + quiz.penality[i]);
			}
			temp = temp + ans + penality;
		}
		System.out.println("Total Score: " + temp);
	}
}

