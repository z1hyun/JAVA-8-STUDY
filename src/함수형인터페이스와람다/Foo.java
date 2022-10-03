package 함수형인터페이스와람다;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {

	public static void main(String[] args) {

//		Plus10 plus10 = new Plus10();
//		System.out.println(plus10.apply(1));

//		Function<Integer, Integer> plus10 = (num) -> num + 10;
//		System.out.println(plus10.apply(1));
//	}
//		Function<Integer, Integer> plus10 = (i) -> i+10;
//		Function<Integer, Integer> multiPly2 = (i) -> i*2;
		
//		Function<Integer, Integer> multiPly2AndPlus10 = plus10.compose(multiPly2);
//		System.out.println(multiPly2AndPlus10.apply(2));
		
//		System.out.println(plus10.andThen(multiPly2).apply(2));

		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10);
		
		Predicate<String> startsWithKeesun = (s) -> s.startsWith("keesun");
		Predicate<Integer> isEven = (i) -> i%2 == 0;
		
	}
}
