package 함수형인터페이스와람다;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer integer) {
		return integer + 10;
	}

}
