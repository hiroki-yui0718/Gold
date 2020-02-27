
public class Exam6 {
	void  outerMethod(){

		class LocalClass{
			public void method() {
				System.out.println("Hello Wold");
			}
		}
		new LocalClass().method();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Exam6 obj = new Exam6();
		obj.outerMethod(); //LocalClassは実行されない

		}
	}

