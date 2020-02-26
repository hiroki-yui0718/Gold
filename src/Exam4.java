
public class Exam4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "あいうえお";
		String str2 = "あいうえお"; // 中身がちょっと違うだけでも…
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println(hashCode1); // → -1095354298
		System.out.println(hashCode2);
	}

}
