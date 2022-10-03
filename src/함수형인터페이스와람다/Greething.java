package 함수형인터페이스와람다;

public class Greething {
	
	private String name;
	
	
	public Greething() {
		
	}
	
	public Greething(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String hello(String name) {
		return "hello " + name;
	}
	public static String hi(String name) {
		return "hi " + name;
	}
}
