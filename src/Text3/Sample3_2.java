package Text3;
import java.util.HashSet;
import java.util.TreeSet;

public class Sample3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] ary =  {"CCC","AAA","BBB"};
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(ary[0]);
		hashset.add(ary[1]);
		hashset.add(ary[2]);
		hashset.add(ary[0]); //重複は採用されない
		//またソートも規則性はない
		for(String str:hashset) {
		System.out.print(str + " ");
		}
		System.out.println();

		TreeSet<String> treeset = new TreeSet<>();
		treeset.add(ary[0]); //ソートはされる
		treeset.add(ary[1]);
		treeset.add(ary[2]);
		treeset.add(ary[0]);
		for(String str:treeset) {
			System.out.print(str + " ");
		}

	}

}
