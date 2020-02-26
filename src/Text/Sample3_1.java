package Text;
import java.util.LinkedList;

public class Sample3_1 {

	public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<>();
			Integer a = 10;
			list.add(a);
			list.add(20);

			for(Integer i : list) {
				System.out.print( i +"\n");
			}
	}
}
