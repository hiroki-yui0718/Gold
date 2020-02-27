package Text3;
import java.util.ArrayDeque;
import java.util.Queue;

public class Sample3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Queue<String> queue = new ArrayDeque<>();
		queue.offer("1");
		queue.offer("2");
		queue.offer("4");
		queue.offer("1");

		System.out.println(queue);
	}

}
