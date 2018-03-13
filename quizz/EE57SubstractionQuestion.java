package quizz;

/** Implementation of a substraction question
 * 
 * @author quentinsauvage
 *
 */
public class EE57SubstractionQuestion implements EE57IntQuestion {

    private int a, b;  // The numbers in the problem.
    
    /** Constructor
     * initiates two random integers
     */
    public EE57SubstractionQuestion() {
    	do{
    		a = (int)(Math.random() * 50 + 1);
        	b = (int)(Math.random() * 50);
        }while(a <= b);
    }
    
    public String getQuestion() {
        return "What is " + a + " - " + b + " ?\n";
    }

    public int getCorrectAnswer() {
        return a - b;
    }

}