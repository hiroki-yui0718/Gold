public class Exam3 { //シングルトン・クラス
	private static final Exam3 obj = new Exam3();
	public static Exam3 getInstance() {
		return obj;
	}
	private Exam3() {}
	public void showMsg() {
		System.out.println("Hello world!!");
	}

}
