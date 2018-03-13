package quizz;

import java.util.Scanner;

/**
 * This program administers a ten-question addition quiz to the user.  The numbers
 * for the problem are chosen at random.  The numbers and the answers are one or
 * two digits.  After asking the user the ten questions, the computer grades the
 * quiz, telling the user the correct answer for any problem they got wrong.
 */
public class EE57AdditionQuizWithObjects {
    
    private static EE57IntQuestion[] questions;  // The questions for the quiz

    private static int[] userAnswers;   // The user's answers to the ten questions.
    
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the quiz!");
        System.out.println("The answer to a question will always be an integer.");
        System.out.println("Let's start !!");
        System.out.println();
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    
    /**
     * Creates the array of objects that holds the quiz questions
     */
    private static void createQuiz() {
        questions = new EE57IntQuestion[10];
        for ( int i = 0; i < 9; i++ ) {
        	if (Math.random() < 0.5)
        	{
        		questions[i] = new EE57AdditionQuestion();	
        	}
	        else{
	            questions[i] = new EE57SubstractionQuestion();
	        }
        }
        questions[9] = new EE57IntQuestion() {
            public String getQuestion() {
                return "What is the answer to the ultimate question " +
                              "of life, the universe, and everything ?\n";
            }
            public int getCorrectAnswer() {
                return 42;
            }
      };
    }
    
    
    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     */
    private static void administerQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s ",
                                  questionNum, questions[i].getQuestion());
            Scanner sc = new Scanner(System.in);
            userAnswers[i] = sc.nextInt();
        }
    }
    
    
    /**
     * Shows all the questions, with their correct answers, and computes a grade
     * for the quiz.  For each question, the user is told whether they got
     * it right.
     */
    private static void gradeQuiz() {
        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("   Question %2d:  %s  Correct answer is %d  ",
                questionNum, questions[i].getQuestion(), questions[i].getCorrectAnswer());
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
            }
        }
        grade = numberCorrect * 10;
        int nbOfQuestions = questions.length;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct out of " + nbOfQuestions + ".");
        System.out.println("Your grade on the quiz is " + grade + "/" + nbOfQuestions * 10);
        System.out.println();
    }

} // end class AdditionQuizWithObjects