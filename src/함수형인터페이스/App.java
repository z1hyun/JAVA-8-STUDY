package 함수형인터페이스;

public class App {
	
	public static void main(String[] args) {
		
		Foo foo =  new DefaultFoo("jihyun");
		
		foo.printName();
		foo.printNameUpperCase();
	}

}
