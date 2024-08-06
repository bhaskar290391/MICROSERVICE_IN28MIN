package programming;

import java.util.List;
import java.util.Optional;

public class FP02Optional {
	public static void main(String[] args) {

		List<String> data=List.of("Banana","Apple","Cashew");
		Optional<String> elements = data.stream().filter(x-> x.startsWith("BB")).findFirst();
		
		System.out.println(elements);
		System.out.println(elements.isEmpty());
		System.out.println(elements.isPresent());
		System.out.println(elements.get());
	}
}
