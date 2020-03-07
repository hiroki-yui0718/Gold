package Text4;

import java.util.function.Function;

public class Sample4_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Function<String,Integer> f1= str -> Integer.parseInt(str);
		int num = f1.apply("100");
		System.out.println(num);

	}

}
