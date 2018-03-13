package quizz;

public class EE57AdditionQuestion implements EE57IntQuestion {

    private int a, b;  // The numbers in the problem.

    /** Constructor
     *  initiates two random integers
     */
    public EE57AdditionQuestion() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?\n";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

}