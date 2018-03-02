/** Exercice 4.3
 * @author quentinsauvage
 */
public class EE43 {
	
	/** counts the number of rolls of two dices it takes to obtain a goal number (the sum of the two dices) 
	 * @param goal the goal to reach with the sum of the two dices
	 * @return number of dice rolls needed to obtain goal
	 */
	public static int numberOfRolls(int goal){
		if (goal < 2 || goal > 12){
			throw new IllegalArgumentException("Goal should be between 2 and 12 included");
		}
		int d1, d2, nb = 0;
		do{
			 d1 = (int) (Math.random()*6.0+1);
             d2 = (int) (Math.random()*6.0+1);
             nb++;
		} while(d1 + d2 != goal);
		return nb;
	}
	
	public static void main(String[] args) {
		System.out.println("The number of rolls to get snake eyes is " + numberOfRolls(2));
	}

}
