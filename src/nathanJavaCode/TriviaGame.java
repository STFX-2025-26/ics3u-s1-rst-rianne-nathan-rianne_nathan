package nathanJavaCode;
import java.util.Scanner;
public class TriviaGame {

	public static void main(String[] args) {
		
		//variables
		String[] easyQuestions = {"How many legs does a spider have?", "What is the name of the toy cowboy in Toy Story?", "What is the color of an emerald?", "Who wrote Romeo and Juliet?", "What is the name of the fairy in Peter Pan?"};
		String[] easyAnswers = {"8", "woody", "green", "shakespeare", "tinkerbell"};
		String[] mediumQuestions = {"What's the capital of Australia?", "What's the chemical symbol for Gold?", "Who painted The Starry Night?", "Whose nose grew longer every time he lied?", "What is the world's longest river?"};
		String[] mediumAnswers = {"canberra", "au", "vanh gogh", "pinnochio", "nile"};
		String[] hardQuestions = {"In which country can you find the world's largest escalator system?", "Which dinosaur's name means \"speedy thief\"?", "In what year was the Gregorian calendar adopted?", "Which animation technique involves tracing over live-action footage to create more realistic character movements?", "Which branch of mathematics gets its name from the Arabic word for \"reuniting\"?"};
		String[] hardAnswers = {"hong kong", "velociraptor", "1582", "rotoscoping", "algebra"};
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
				results(correctPoints, incorrectPoints, correctMark, incorrectMark);
				userInput = 4;
			}
			else if (userInput == 2) {
				correctPoints = compareQuestions(mediumQuestions, mediumAnswers);
				incorrectPoints = mediumQuestions.length - correctPoints;
				correctMark = percentCalc(correctPoints, mediumQuestions.length);
				incorrectMark = percentCalc(incorrectPoints, mediumQuestions.length);
				results(correctPoints, incorrectPoints, correctMark, incorrectMark);
				userInput = 4;
				
			}
			
			else if (userInput == 3) {
				correctPoints = compareQuestions(hardQuestions, hardAnswers);
				incorrectPoints = hardQuestions.length - correctPoints;
				correctMark = percentCalc(correctPoints, hardQuestions.length);
				incorrectMark = percentCalc(incorrectPoints, hardQuestions.length);
				results(correctPoints, incorrectPoints, correctMark, incorrectMark);
				userInput = 4;
			}
			
			else if (userInput == 4) {
				
				System.out.println("Exiting");
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
			userAns = sc.nextLine();
			
			if (userAns.toLowerCase().equals(answ[i])) {
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
		System.out.println("Percent correct:" + pc + "%");
		System.out.println("Percent incorrect:" + pi + "%");
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
