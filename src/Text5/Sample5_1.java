package Text5;
import java.util.Arrays;
import java.util.List;

public class Sample5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = Arrays.asList("BBB","AAA","CCC");
		list.stream().sorted().map(s -> s.toUpperCase()).forEach(
													s -> System.out.print(s + " "));

	}

}
