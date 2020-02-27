import java.util.Arrays;
import java.util.List;

public class Exam6 {
	void  outerMethod(){
		List<String> list = Arrays.asList("H","Y");
		class LocalClass{
			public void method() {
				System.out.println("Hello Wold");

				list.forEach(System.out::print);
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

