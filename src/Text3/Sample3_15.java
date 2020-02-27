package Text3;

interface MyIn<T>{ void method(T t);}
class Foo implements MyIn<String>{
	public void method(String str) {
		System.out.println(str);
	}
}

class Bar implements MyIn<Integer>{
	public void method(Integer num) {
		System.out.println(num);
	}
}
public class Sample3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Foo f = new Foo();
		f.method("Hello World");
		Bar b = new Bar();
		b.method(9508);
	}

}
