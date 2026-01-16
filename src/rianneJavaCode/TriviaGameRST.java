package rianneJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JButton Button1;
	private JButton Button2;
	private JButton mixedButton;
	private JButton button4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JButton button4 = new JButton("Generate Question");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// arrays for science questions and answers
				String[] sciQuestions = new String[5];
				sciQuestions[0] = "What is the most basic unit of the human body?";
				sciQuestions[1] =  "What is the powerhouse of the cell?" ;
				sciQuestions[2] =  "What is the process in which cells reproduce asexually?";
				sciQuestions[3] = "What organelle contains the DNA of the cell?";
				sciQuestions[4] =  "A collection of cells is known as what?";
				
				String[] sciAnswers = new String[5];
				sciAnswers[0] = "Cell";
				sciAnswers[1] = "Mitochondria";
				sciAnswers[2] = "Mitosis";
				sciAnswers[3] = "Nucleus";
				sciAnswers[4] = "Tissue";
				
				// arrays for history questions and answers
				String[] histQuestions = new String[5];
				histQuestions[0] = "When was Canada founded?";
				histQuestions[1] = "Who was the first prime minister of Canada?";
				histQuestions[2] = "What year was the canadian penny discontinued?";
				histQuestions[3] = "When did WWll end?";
				histQuestions[4] = "When did WWl end?";
				
				String[] histAnswers = new String[5];
				histAnswers[0] =  "1867";
				histAnswers[1] =  "Sir John A Macdonald";
				histAnswers[2] =  "2013";
				histAnswers[3] =  "1917";
				histAnswers[4] =  "1945";
				
				
				int totalLength = sciQuestions.length + histQuestions.length;
				int randomIndex = (int) (Math.random() * totalLength);
				
				String currentQuestion = "";
				
				
				if (Button1.isSelected())
					
					currentQuestion = sciQuestions[(int)(Math.random() * sciQuestions.length)];
				
				
				else if (Button2.isSelected())
					
					currentQuestion = histQuestions[(int)(Math.random() * histQuestions.length)];
				
				
				else if (mixedButton.isSelected())
					
					if (randomIndex < sciQuestions.length)
						currentQuestion = sciQuestions[randomIndex];
				
					else
						currentQuestion = histQuestions[randomIndex - sciQuestions.length];
				
				textField.setText(currentQuestion);
				textField_1.setText("");
				
			}
		});
		button4.setBounds(138, 107, 149, 23);
		frame.getContentPane().add(button4);
		
		JLabel lblNewLabel_2 = new JLabel("Question:");
		lblNewLabel_2.setBounds(65, 135, 56, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 160, 190, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Type your answer here:");
		lblNewLabel_3.setBounds(254, 135, 148, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 160, 170, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton Button1 = new JButton("Science");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// arrays for questions and answers
				String[] sciQuestions = new String[5];
				sciQuestions[0] = "What is the most basic unit of the human body?";
				sciQuestions[1] =  "What is the powerhouse of the cell?" ;
				sciQuestions[2] =  "What is the process in which cells reproduce asexually?";
				sciQuestions[3] = "What organelle contains the DNA of the cell?";
				sciQuestions[4] =  "A collection of cells is known as what?";
				
				String[] sciAnswers = new String[5];
				sciAnswers[0] = "Cell";
				sciAnswers[1] = "Mitochondria";
				sciAnswers[2] = "Mitosis";
				sciAnswers[3] = "Nucleus";
				sciAnswers[4] = "Tissue";
				
				
			}
		});
		Button1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Button1.setForeground(new Color(0, 0, 0));
		Button1.setBackground(new Color(0, 128, 0));
		Button1.setBounds(46, 63, 89, 23);
		frame.getContentPane().add(Button1);
		
		JButton mixedButton = new JButton("Mixed");
		mixedButton.setForeground(new Color(0, 0, 0));
		mixedButton.setBackground(new Color(255, 70, 70));
		mixedButton.setBounds(175, 62, 89, 23);
		frame.getContentPane().add(mixedButton);
		
		JButton Button2 = new JButton("History");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// arrays for questions and answers
				String[] histQuestions = new String[5];
				histQuestions[0] = "When was Canada founded?";
				histQuestions[1] = "Who was the first prime minister of Canada?";
				histQuestions[2] = "What year was the canadian penny discontinued?";
				histQuestions[3] = "When did WWll end?";
				histQuestions[4] = "When did WWl end?";
				
				String[] histAnswers = new String[5];
				histAnswers[0] =  "1867";
				histAnswers[1] =  "Sir John A Macdonald";
				histAnswers[2] =  "2013";
				histAnswers[3] =  "1917";
				histAnswers[4] =  "1945";
			}
		});
		Button2.setBackground(new Color(255, 128, 0));
		Button2.setBounds(303, 63, 89, 23);
		frame.getContentPane().add(Button2);
		
		JLabel lblNewLabel_4 = new JLabel("Total Points");
		lblNewLabel_4.setBounds(313, 236, 77, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(397, 233, 27, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Check Answer");
		btnNewButton_4.setBounds(264, 191, 128, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
