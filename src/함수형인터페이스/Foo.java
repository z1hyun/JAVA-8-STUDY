package 함수형인터페이스;

public interface Foo {

	void printName();
	
	default void  printNameUpperCase() {
//		System.out.println("default Keyword");
		System.out.println(getName().toUpperCase());
	};

	String getName();
}
