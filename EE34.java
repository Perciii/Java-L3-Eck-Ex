import java.util.Scanner;

public class EE34 {

	public static void split(String sentence){
		String[] splitSentence = sentence.split("[^A-Za-z]");
		for(String word : splitSentence){
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		split(sentence);

	}

}
