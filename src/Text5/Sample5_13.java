package Text5;

import java.util.stream.IntStream;

public class Sample5_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IntStream.iterate(1,n->n+1).limit(10L).forEach(x ->System.out.print(x + " "));
		System.out.println();
		IntStream.rangeClosed(1,10).skip(2).forEach(x -> System.out.print(x + " "));
		System.out.println();
		IntStream.iterate(1,n->n+1).skip(100).limit(5L).forEach( x -> System.out.print(x + " "));
	}

}
