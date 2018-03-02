import java.util.Scanner;

public class EE34 {

	public static void split(String sentence){
		String[] splitSentence = sentence.split("[^A-Za-z]");
		for(String word : splitSentence){
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Entrez une phrase : ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		split(sentence);

	}

}
