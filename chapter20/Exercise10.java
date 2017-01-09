/**
 * (Perform set operations on priority queues)
 * Create two priority queues, {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
 * {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their
 * union, difference, and intersection.
 *
 */

 import java.util.*;

public class Exercise10 {
	public static void main(String[] args) {
		// Create two priority queues
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(
			"George", "Jim", "John", "Blake", "Kevin", "Michael"));

		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(
			"George", "Katie", "Kevin", "Michelle", "Ryan"));

		//Output two sets, union, difference, intersection
		System.out.println("Set1: " + queue1);
		System.out.println("Set2: " + queue2);
		System.out.println("Union of sets: " + union(queue1, queue2));
		System.out.println("Difference of sets: " + difference(queue1, queue2));
		System.out.println("Intersection of sets: " + intersection(queue1, queue2));
	}

	//Display union
	private static <E> PriorityQueue<E> union(
			PriorityQueue<E> set1, PriorityQueue<E> set2) {
		PriorityQueue<E> union = new PriorityQueue<>(set1);
		union.addAll(set2);
		return union;
	}

	//Display difference
	private static <E> PriorityQueue<E> difference(
			PriorityQueue<E> set1, PriorityQueue<E> set2) {
		PriorityQueue<E> difference = new PriorityQueue<>(set1);
		difference.removeAll(set2);
		return difference;
	}

	//Display intersection
	private static <E> PriorityQueue<E> intersection(
			PriorityQueue<E> set1, PriorityQueue<E> set2) {
		PriorityQueue<E> intersection = new PriorityQueue<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
}
