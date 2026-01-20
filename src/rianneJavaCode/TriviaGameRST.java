package rianneJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class TriviaGameRST {

	private JFrame frame;
	private JButton science;
	private JButton mixed;
	private JButton history;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String correctAnswer = "";
	private int points = 0;
	String currentQuestion = "";
	private String selectedCategory = "";
	private int totalQuestions = 0;
	private int correctAnswers = 0;
	private final int MAX_QUESTIONS = 5;
	private int score = totalQuestions / 5 * 100;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriviaGameRST window = new TriviaGameRST();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TriviaGameRST() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(205, 243, 235));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trivia");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(175, 2, 65, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the topic of your trivia");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(138, 36, 170, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question:");
		lblNewLabel_2.setBounds(65, 135, 56, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 160, 190, 55);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Type your answer here:");
		lblNewLabel_3.setBounds(254, 135, 148, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(254, 160, 170, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Total Points");
		lblNewLabel_4.setBounds(313, 236, 77, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 233, 27, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Check Answer");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userAnswer = textField_2.getText().trim();
				
				if (userAnswer.isEmpty()) {
					
					JOptionPane.showMessageDialog(frame, "Please enter an answer.");
					return;
				}
				
				String correctAnswer = "";
		        if (selectedCategory.equals("Science")) {
		            String[] sciQuestions = {
		                "What is the most basic unit of the human body?",
		                "What is the powerhouse of the cell?",
		                "What is the process in which cells reproduce asexually?",
		                "What organelle contains the DNA of the cell?",
		                "A collection of cells is known as what?"
		            };
		            
		            String[] sciAnswers = {"Cell", "Mitochondria", "Mitosis", "Nucleus", "Tissue"};

		            for (int i = 0; i < sciQuestions.length; i++) {
		                if (currentQuestion.equals(sciQuestions[i])) {
		                    correctAnswer = sciAnswers[i];
		                    break;
		                }
		            }
		        } else if (selectedCategory.equals("History")) {
		            String[] histQuestions = {
		                "When was Canada founded?",
		                "Who was the first prime minister of Canada?",
		                "What year was the canadian penny discontinued?",
		                "When did WWll end?",
		                "When did WWl end?"
		            };
		            String[] histAnswers = {"1867", "Sir John A Macdonald", "2013", "1945", "1918"}; // fixed WWI/WWII mix

		            for (int i = 0; i < histQuestions.length; i++) {
		                if (currentQuestion.equals(histQuestions[i])) {
		                    correctAnswer = histAnswers[i];
		                    break;
		                }
		            }
		        } else if (selectedCategory.equals("Mixed")) {
		            // Mixed can use the same logic as above, check both arrays
		            String[] sciQuestions = {
		                "What is the most basic unit of the human body?",
		                "What is the powerhouse of the cell?",
		                "What is the process in which cells reproduce asexually?",
		                "What organelle contains the DNA of the cell?",
		                "A collection of cells is known as what?"
		            };
		            String[] sciAnswers = {"Cell", "Mitochondria", "Mitosis", "Nucleus", "Tissue"};
		            String[] histQuestions = {
		                "When was Canada founded?",
		                "Who was the first prime minister of Canada?",
		                "What year was the canadian penny discontinued?",
		                "When did WWll end?",
		                "When did WWl end?"
		            };
		            String[] histAnswers = {"1867", "Sir John A Macdonald", "2013", "1945", "1918"};

		            for (int i = 0; i < sciQuestions.length; i++) {
		                if (currentQuestion.equals(sciQuestions[i])) {
		                    correctAnswer = sciAnswers[i];
		                    break;
		                }
		            }
		            if (correctAnswer.equals("")) {
		                for (int i = 0; i < histQuestions.length; i++) {
		                    if (currentQuestion.equals(histQuestions[i])) {
		                        correctAnswer = histAnswers[i];
		                        break;
		                    }
		                }
		            }
		        }

		        // Check answer (case-insensitive)
		        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
		            points += 1;
		            totalQuestions += 1;
		            JOptionPane.showMessageDialog(frame, "Answer correct! You earned 1 point.");
		        } 
		        
		        else {
		        	points -= 1;
		            JOptionPane.showMessageDialog(frame, "Answer incorrect! The correct answer was: " + correctAnswer);
		        }

		        textField_3.setText(String.valueOf(points));
		        textField_2.setText("");
		        if (totalQuestions >= MAX_QUESTIONS) {
		        	JOptionPane.showMessageDialog(frame, "You got" + totalQuestions + "/5, that's" + score + "%.");
				
		        }
			}
		});
		btnNewButton_4.setBounds(264, 191, 128, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton button4 = new JButton("Generate Question");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// arrays for science questions and answers
				String[] sciQuestions = {
					"What is the most basic unit of the human body?",
					"What is the powerhouse of the cell?",
					"What is the process in which cells reproduce asexually?",
					"What organelle contains the DNA of the cell?",
					"A collection of cells is known as what?"
				
				};
					
				String[] sciAnswers = {
					"Cell",
					"Mitochondria",
					"Mitosis",
					"Nucleus",
					"Tissue"
				
				};
					
				// arrays for history questions and answers
				String[] histQuestions = {
					"When was Canada founded?",
					"Who was the first prime minister of Canada?",
					"What year was the canadian penny discontinued?",
					"When did WWll end?",
					"When did WWl end?"
						
				};
					
				String[] histAnswers = {
					"1867",
					"Sir John A Macdonald",
					"2013",
					"1917",
					"1945"
					
				};
				
				int totalLength = sciQuestions.length + histQuestions.length;
				int randomIndex = (int) (Math.random() * totalLength);
				
				
				Object source = e.getSource();
				
				
				if (source == science)
					
					selectedCategory = "Science";
				
				
				else if (source == history)
					
					selectedCategory = "History";
				
				
				else if (source == mixed)
					
					selectedCategory = "Mixed";
				
				else if (source == button4)
					
					if (selectedCategory.equals("")) {
						textField_1.setText("Please choose a category first.");
						return;
					}	
					
					if (selectedCategory.equals("Science"))
					
						currentQuestion = sciQuestions[(int)(Math.random() * sciQuestions.length)];
					
					else if (selectedCategory.equals("History"))
						
						 currentQuestion = histQuestions[(int)(Math.random() * histQuestions.length)];
					
					else if (selectedCategory.equals("Mixed"))
						
						if (randomIndex < sciQuestions.length)
							currentQuestion = sciQuestions[randomIndex];
				
						else
							currentQuestion = histQuestions[randomIndex - sciQuestions.length];
				
				textField_1.setText(currentQuestion);
				
			}
		});
		button4.setBounds(156, 96, 126, 23);
		frame.getContentPane().add(button4);
		
		JButton science = new JButton("Science");
		science.setBackground(new Color(0, 128, 0));
		science.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectedCategory = "Science";
			}
		});
		science.setBounds(32, 62, 89, 23);
		frame.getContentPane().add(science);
		
		JButton mixed = new JButton("Mixed");
		mixed.setBackground(new Color(247, 113, 94));
		mixed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectedCategory = "Mixed";
			}
		});
		mixed.setBounds(171, 61, 89, 23);
		frame.getContentPane().add(mixed);
		
		JButton history = new JButton("History");
		history.setBackground(new Color(255, 128, 0));
		history.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectedCategory = "History";
			}
		});
		history.setBounds(313, 62, 89, 23);
		frame.getContentPane().add(history);
	}
}
