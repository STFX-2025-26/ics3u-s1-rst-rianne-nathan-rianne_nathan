package nathanJavaCode;
import java.util.Scanner;
public class TriviaGame {

	public static void main(String[] args) {
		
		//variables
		String[] easyQuestions = {"How many legs does a spider have?", "What is the name of the toy cowboy in Toy Story?", "What is the color of an emerald?", "Whose nose grew longer every time he lied?", "What is the name of the fairy in Peter Pan?"};
		String[] easyAnswers = {"8", "woody", "green", "pinnochio", "tinkerbell"};
		String[] mediumQuestions = {};
		String[] mediumAnswers = {};
		String[] hardQuestions = {};
		String[] hardAnswers = {};
		
		
		
	}
	
	//DESCRIPTION - Compare the 2 string lists based on user input
	//PARAMETERS - String[] ques , String[] answ
	//RETURN TYPE - int
	public static int compareQuestions(String[] ques, String[] answ) {
		
		//variables
		int userScore = 0;
		Scanner sc = new Scanner(System.in);
		String userAns = "";
		
		//for loop asking questions
		for (int i=0; i<ques.length; i++) {
			
			System.out.println(ques[i]);
			userAns = sc.next();
			
			if (userAns.equals(answ[i])) {
				userScore++;
			}
			else {
				System.out.println("Incorrect!");
			}
		}
		
		//returning score
		return userScore;
	}

}
