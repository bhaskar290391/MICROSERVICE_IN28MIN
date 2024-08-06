package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(51, 15, 78, 27, 98);
		//printAllNumberByStructured(numbers);
		printEvenNumberByStructured(numbers);
	}

	private static void printAllNumberByStructured(List<Integer> numbers) {

		for (Integer number : numbers) {
			System.out.println("The number is " + number);
		}
	}
	
	private static void printEvenNumberByStructured(List<Integer> numbers) {

		for (Integer number : numbers) {
			if(number %2 ==0)
			System.out.println("The Even number is " + number);
		}
	}
}
