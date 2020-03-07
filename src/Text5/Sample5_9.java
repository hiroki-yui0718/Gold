package Text5;

import java.util.Optional;
import java.util.stream.Stream;

public class Sample5_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<String> stream1 = Stream.of("aaa","bbb","ccc");
		Optional<String> result1 = stream1.max((d1,d2) -> d1.length() - d2.length());
		result1.ifPresent(System.out::println);

	}
}
