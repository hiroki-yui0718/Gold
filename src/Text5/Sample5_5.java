package Text5;

import java.util.stream.IntStream;

public class Sample5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IntStream stream = IntStream.of(10,20,30);
		int result = stream.reduce(0,Integer::sum);
		System.out.println(result);
	}

}
