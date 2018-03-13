package e1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Merging two sets
 * 
 * @author quentinsauvage
 *
 */
public class E1 {
	
	/**
	 * @return set of entered integers
	 */
	public static Set setOfValues(){
		Scanner sc = new Scanner(System.in);
		Set<Integer> values = new HashSet<Integer>();
		int lastValueEntered = 1;
		
		while(lastValueEntered != 0){
			lastValueEntered = sc.nextInt();
			values.add(lastValueEntered);
		}
		return values;
	}
	
	public static void display(){
		System.out.println("Please enter a first set of integers finished by 0 :");
		Set<Integer> v1 = setOfValues();		
		System.out.println("Please enter a second set of integers finished by 0 :");
		Set<Integer> v2 = setOfValues();
		System.out.println("Your first set : " + v1);
		System.out.println("Your second set : " + v2);
		v1.addAll(v2);
		System.out.println("The two sets combined : " + v1);	
	}
	
	public static void main(String args[]){
		display();
	}
}
