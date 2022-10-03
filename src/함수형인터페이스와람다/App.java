package 함수형인터페이스와람다;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
	
	public static void main(String[] args) {
		
//		UnaryOperator<String> hi = (s) -> "hi" + s;
//		UnaryOperator<String> hi = Greething::hi;
		
//		Greething greeting = new Greething();
		
//		Supplier<Greething> newGreeting = Greething::new;
		
//		UnaryOperator<String> hello = greeting::hello;
		
//		System.out.println(hello.apply("jihyun"));
		
		
//		Function<String, Greething> jihyunGreeting =  Greething::new;
//		
//		Greething jihyun = jihyunGreeting.apply("jihyun");
//		System.out.println(jihyun.getName());
//		
//		
//		
//		Supplier<Greething> newGreeting  =  Greething::new;
//		
		String[] names =  { "jihyun" , "jungmo", "toby"	};
		Arrays.sort(names , String::compareToIgnoreCase);
		
		System.out.println(Arrays.toString(names));
		
		
	}
}
