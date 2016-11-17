package subash.tekSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Prime {

	/**
	 * This application generates the random positive integer value between 0 to 1000,
	 * and calculate whether the integer is a prime number or not and prints prime number(s).
	 * @param args
	 */
	public static void main(String[] args) {
		
		Randomizer primeRandomizer = new Randomizer();
		Queue<Integer> primeNumber = returnPrimenumber(primeRandomizer.generateRandonPositiveInteger());
		//prints the prime numbers
		primeRandomizer.printPrimenumber(primeNumber);
	}
	
	/**
	 * 
	 * @param generateRandonPositiveInteger
	 * @return
	 */
	private static Queue<Integer> returnPrimenumber(Queue<Integer> generateRandonPositiveInteger) {
		Queue<Integer> primeNumber = new LinkedList<>();
		Queue<Integer> notPrimeNumber = new LinkedList<>();
		LinkedList<Integer> randomGeneratedInteger = new LinkedList<>();
		
		while (!generateRandonPositiveInteger.isEmpty()) {
			int checkPrimeNumber = generateRandonPositiveInteger.poll();
			randomGeneratedInteger.add(checkPrimeNumber);
			// we know 0 and 1 are not prime number
			if (checkPrimeNumber == 0 || checkPrimeNumber == 1) {
				notPrimeNumber.add(checkPrimeNumber);
			} else if (checkPrimeNumber % 2 == 0) {
				notPrimeNumber.add(checkPrimeNumber);
			} else {
				//System.out.println(checkPrimeNumber + " is Prime Number!!");
				primeNumber.add(checkPrimeNumber);
			}
		}
		System.out.println("Random generated integer is/are: " + randomGeneratedInteger.toString());
		System.out.println("Not prime integer is/are: " + notPrimeNumber.toString());
		return primeNumber;
	}
}
