import java.util.Scanner;

public class EE27 {
	public static double average(int[] tab){
		int sum = 0;
		double length = tab.length;
		for(int i=0; i<length; i++){
			sum += tab[i];
		}
		double avg = sum/length;
		return avg;
	}

	public static void readAndPrint(){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int scores[] = new int[3];
		for (int i=0; i<3; i++){
			scores[i] = sc.nextInt();
		}
		
		double avgScores = average(scores);
		
		System.out.println("Name : " + name);
		System.out.println("Scores average : " + avgScores);
	}
	
	public static void main(String[] args) {
		readAndPrint();
	}

}
