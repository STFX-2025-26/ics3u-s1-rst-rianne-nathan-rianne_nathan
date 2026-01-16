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
		int correctPoints;
		int incorrectPoints;
		double correctMark;
		double incorrectMark;
		int userInput = 0;
		Scanner sc = new Scanner(System.in);
		
		//Introduction
		intro();
		userInput = sc.nextInt();
		
		//menu loop
		
		while (userInput != 4) {
			
			if (userInput == 1) {
				
				correctPoints = compareQuestions(easyQuestions, easyAnswers);
				incorrectPoints = easyQuestions.length - correctPoints;
				correctMark = percentCalc(correctPoints, easyQuestions.length);
				incorrectMark = percentCalc(incorrectPoints, easyQuestions.length);
			}
		}
		
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
				System.out.println("Correct!");
			}
			else {
				System.out.println("Incorrect!");
			}
		}
		
		//returning score
		return userScore;
	}
	
	//DESCRIPTION - Print out introduction and instructions for trivia game to user
	//PARAMETERS - none
	//RETURN TYPE - void
	public static void intro() {
		
		System.out.println("Hello! This is your super-duper-luper-scuper trivia game!");
		System.out.println("Please select a difficulty!");
		System.out.println("Type 1 for the easy difficulty!");
		System.out.println("Type 2 for the medium difficulty!");
		System.out.println("Type 3 for the hard difficulty!");
		System.out.println("Type 4 to exit!");
		
	}
	//DESCRIPTION - Print out the results of the trivia game!
	//PARAMETERS - int ac, int ai, double pc, double pi
	//RETURN TYPE - void
	public static void results(int ac, int ai, double pc, double pi) {
		
		
		System.out.println("Here are the Results!");
		System.out.println("Answers correct: " + ac + "/" + (ac+ai));
		System.out.println("Answers incorrect: " + ai + "/" + (ac+ai));
		System.out.println("Percent correct:" + pc);
		System.out.println("Percent incorrect:" + pi);
		System.out.println("Hope you had fun!");
		
	}
	
	//DESCRIPTION - Calculates percent
	//PARAMETERS - double c, double i
	//RETURN TYPE - String
	public static double percentCalc(double c, double t) {
		
		//variables
		double average;
		
		//calculations
		average = c/t;
		
		//rounding
		average = average * 1000;
		
		Math.round(average);
		
		average = average/10;
		
		
		return average;
		
	}

}
