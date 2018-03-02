import java.util.Scanner;
/** Exercice 4.7
 * @author quentinsauvage
 */
public class EE47{

    private static int[] nb1;
    private static int[] nb2;
    private static int[] answer;
    
    public static void main(String[] args) {
        int size = 10;
        quizz(size);
        grade(size);
    }
    
    /** generates numbers that will be part of the additions to calculate
     * and initializes the array of the answers
     * @param size the number of couples of numbers to generate
     */
    public static void generateQuizz(int size)
    {
        nb1 = new int[size];
        nb2 = new int[size];
        answer = new int[size];
        for(int i = 0; i<size; i++)
        {
            nb1[i] = (int)(Math.random()*50+1);
            nb2[i] = (int)(Math.random()*50+1);
            answer[i] = 0;
        }
    
    }
    
    /** generates the quizz from previously generated numbers
     * @param nbOfQuestions
     */
    public static void quizz(int nbOfQuestions)
    {
    	generateQuizz(nbOfQuestions);
        Scanner sc = new Scanner(System.in);
        System.out.println("Début du quizz : ");
        for(int i = 0; i < nbOfQuestions; i++)
        {
            System.out.println("Question " +(i+1) + " : "+nb1[i]+" + "+nb2[i]+ " = ?");
            answer[i] = sc.nextInt();
            
            if(answer[i] == nb1[i] + nb2[i])
            {
                System.out.println("You rock !");
            }
            else
            {
                System.out.println("Too bad ! Here's the answer : " +(nb1[i]+nb2[i]));
            }
        }
    }
    
    /** calculates the score of the player based on his answers
     * @param size the number of questions in the quizz
     */
    public static void grade(int size)
    {
        int score = 0;
        for(int i = 0; i<size;i++)
        {
            if(answer[i] == nb1[i] + nb2[i])
            {
                score+=10;
            }
        }
        System.out.println("Votre score est " + score+"/100");
    }
}