/**
 * 
 */
package subash.tekSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * @author subashshrestha
 *
 */
public class Randomizer {
	
	private Queue<Integer> queue;
	private static final int MAX_INTEGER = 1000;
	private static final int MIN_INTEGER = 0;
	private int choose;
	private int sizeofRandomValue;
	Scanner keyboard;

	/**
	 * generates the random positive integer values between 0 to 1000
	 * @return
	 */
	public Queue<Integer> generateRandonPositiveInteger() {
		keyboard = new Scanner(System.in);
		System.out.print("Plese enter an integer to generate the random positive integer between 0 to number: ");
		sizeofRandomValue=keyboard.nextInt();
		queue = new LinkedList<>();
		
		// generates a random positive number in between 0 (inclusive) and 1000 (exclusive)
		Random randomPositiveInteger = new Random();
		for (int i = 0; i <= sizeofRandomValue; i++) {
			choose = randomPositiveInteger.nextInt(MAX_INTEGER-MIN_INTEGER) + MIN_INTEGER;
			queue.add(choose);
		}
		return queue;
	}

	/**
	 * 
	 * @param number
	 */
	public void printPrimenumber(Queue<Integer> number) {
		System.out.println("Prime Number is/are: " + number.toString());

	}

}
