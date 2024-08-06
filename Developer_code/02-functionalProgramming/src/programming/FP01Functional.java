package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(51, 15, 78, 27, 98);
		//printAllNumberByFunctional(numbers);
		//printEvenNumberByFunctional(numbers);
		printSquareOfEvenNumberByFunctional(numbers);
	}

	private static void printSquareOfEvenNumberByFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number %2 ==0)
		.map(number-> number *number)
		.forEach(FP01Functional::print);
		
	}

	public static void print(int number) {
		System.out.println("The number is " + number);
	}

	private static void printAllNumberByFunctional(List<Integer> numbers) {

		numbers.stream().forEach(FP01Functional::print);

	}
	
	private static void printEvenNumberByFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number %2 ==0)
		.forEach(FP01Functional::print);

	}
}
