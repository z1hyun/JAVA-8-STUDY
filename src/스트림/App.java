package 스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("hyunji");
		names.add("jungmo");
		names.add("startship");
		names.add("minhee");
		
		
//		Stream<String> stringStream = names.stream().map(String::toUpperCase);
//		names.stream().map((s) -> {
//			System.out.println(s);
//			return s.toUpperCase();
//		});
		
		List<String> collect = names.stream().map((s) -> {
			System.out.println(s);
			return s.toUpperCase();
		}).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println("=============");
		names.forEach(System.out::println);
		
//		stringStream.forEach(System.out::println);
	}
}
