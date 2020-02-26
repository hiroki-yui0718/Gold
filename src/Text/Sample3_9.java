package Text;
import java.util.HashMap;

public class Sample3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<Integer,String> map = new HashMap<>();
		map.put(0,"Yui");
		map.put(1,"Tanaka");
		map.put(2,"Suzuki");
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Suzuki"));
		for(int i = 0;i< map.size();i++) {
			System.out.print(map.get(i)+ " ");
		}
	}

}
