package Text5;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Sample5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BinaryOperator<Integer> operator = (a,b) -> a + b; //引数２つ
		Stream<Integer> stream1 = Stream.of(10,20,50);
		Optional<Integer> result = stream1.reduce(operator); //Optionalクラス
		result.ifPresent(System.out::println);
	}

}
