package 함수형인터페이스;

public class DefaultFoo implements Foo{

	
	String name; 
	
	public DefaultFoo(String name) {
		this.name = name;
	}
	
	@Override
	public void printNameUpperCase() {
		System.out.println(getName().toUpperCase());
	}
	
	@Override
	public void printName() {
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		return this.name;
	}

	
	
}
