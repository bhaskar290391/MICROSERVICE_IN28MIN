package programming;

import java.util.List;

public class FP01FunctionalExcercise {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(51, 15, 78, 27, 98);
		
		List<String> data=List.of("Spring","Spring boot","Azure","PCF","Docker");
		
		//printEvenNumberByFunctional(numbers);
		//printOddNumberByFunctional(numbers);
		//printCubeOfOddNumberByFunctional(numbers);
		
		
		//data.stream().forEach(System.out::println);
		
		//data.stream().filter(a->a.length() >4).forEach(System.out::println);
		
		//data.stream().filter(a->a.contains("Spring") ).forEach(System.out::println);
		
		data.stream().map(string-> string +"-->Count : "+string.length())
		.forEach(System.out::println);
	}

	private static void printCubeOfOddNumberByFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number %2 !=0)
		.map(number-> number *number *number)
		.forEach(FP01FunctionalExcercise::print);
		
	}

	private static void printOddNumberByFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number %2 !=0)
		.forEach(FP01FunctionalExcercise::print);
		
	}

	private static void printAllNumberByFunctional(List<Integer> numbers) {

		numbers.stream().forEach(FP01FunctionalExcercise::print);

	}
	
	private static void printEvenNumberByFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number %2 ==0)
		.forEach(FP01FunctionalExcercise::print);

	}
	
	public static void print(int number) {
		System.out.println("The number is " + number);
	}
}
