
public class Exam1 { //内部クラス
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		OuterClass oc= new OuterClass();
		OuterClass.InnerClass  ic = oc.new InnerClass();
		ic.show();
	}
}
class OuterClass{

	private String str = "Hello World!";

	class InnerClass{
		public void show() {
			System.out.println(str);
		}
	}
}

