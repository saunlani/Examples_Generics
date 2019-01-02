import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.examplestopresent.generics.Container;

public class Examples {
	
	// (Generics: Methods)
	// Generic methods are not simply methods in a Generic class.  Generic methods can exist in any class.
	// Generic methods can accept, process and return a value of any data type.
	// Notice that we can declare a generic type at the method level, instead of utilizing a separate class
	// to contain it.
	
	public static <T> void PrintArray(T[] array) {
		System.out.println("Methods Example:");
		for (T element: array) {
			System.out.print(element + ", ");
		}
		System.out.println();
		System.out.println();
	}
	

	public static void main(String[] args) {
		
	// (Generics: Methods)
		Integer[] intArray = { 0, 3, 6, 9, 12 };
		String[] stringArray = { "Ritchie", "Gates", "Jobs", "Thompson" };
		PrintArray(intArray);
		

	// (Generics: Classes)
		Container<Integer, String> Container1 = new Container<>(12 , "some string");
		
		// If we try to change c1Var1's type to anything besides an int, type safety will be enforced.
		// If we try to change c1Var2's type to anything besides an String, type safety will be enforced.
		int c1Var1 = Container1.getItem1();
		String c1Var2 = Container1.getItem2();
		
		Container<String, LocalDateTime> Container2 = new Container<>("another string", LocalDateTime.now());
		
		String c2Var1 = Container2.getItem1();
		LocalDateTime c2Var2 = Container2.getItem2();
		
		System.out.println("Classes Example:");
		Container1.printItems();
		Container2.printItems();
		

	}
}

