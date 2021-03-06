import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EE36{
	public static int numberOfDivisors(int nb){
		int count = 1; //nb is a divisor of nb
		for(int div = 1; div <= nb/2; div++){// the greatest divisor after itself is <= nb/2
			if(nb%div == 0){
				count += 1;
			}
		}
		return count;
	}
	
	public static List<Integer> nbWithMaxDivisors(int maxLim){
		List<Integer> numberOfDivisorsTab = new ArrayList<Integer>();
		List<Integer> nbWithMaxDivisors = new ArrayList<Integer>();
		
		for(int i = 0; i < maxLim; i++){
			numberOfDivisorsTab.add(numberOfDivisors(i + 1));
		}
		
		int maxNumberOfDivisors = Collections.max(numberOfDivisorsTab);
		
		for(int i = 0;  i < maxLim; i++){
			int cur = numberOfDivisorsTab.get(i);
			if (cur == maxNumberOfDivisors){
				nbWithMaxDivisors.add(i+1);
			}
		}
		return nbWithMaxDivisors;
	}
	
	public static void display(List<Integer> nbWithMaxDivisors, int maxLim){
		int maxNbDivisors = numberOfDivisors(nbWithMaxDivisors.get(0));
		System.out.format("Among integers between 1 and %d,\n", maxLim);
		System.out.println("The maximum number of divisors was "+ maxNbDivisors);
		System.out.println("Numbers with that many divisors include:");
		for(int nb : nbWithMaxDivisors){
			System.out.println("\t" + nb);
		}
	}
	
	public static void main(String[] args){ 
		display(nbWithMaxDivisors(10000), 10000);
	}

}