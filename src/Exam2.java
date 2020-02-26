
interface InterfaceHello{
	default String ReturnMsg() {
		return "Hello World";
	}
}

class ClassHello implements InterfaceHello{

}

public class Exam2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ClassHello obj = new ClassHello();
		System.out.println(obj.ReturnMsg());
		Exam3 obj2 = Exam3.getInstance();
		obj2.showMsg();
	}

}
