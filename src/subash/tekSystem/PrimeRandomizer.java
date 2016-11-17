package subash.tekSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PrimeRandomizer {
	
	Queue<Integer> queue;
	int max = 1000;
	int choose;
	

	public Queue<Integer> generateRandonPositiveInteger(){
		queue = new LinkedList<>();
		Random randomPositiveInteger = new Random();
		for (int i = 0; i < 10; i++) {
			choose = randomPositiveInteger.nextInt(max);
			queue.add(choose);
			
		}
	
		return queue;
	}
	

}
