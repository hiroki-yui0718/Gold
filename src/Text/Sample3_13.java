package Text;

class Gen<T>{ //どんな型も当てはめることが可能
	private T var1;
	public Gen(T var1) {this.var1 = var1;}
	public T getVar1() {return this.var1;}
	public <T> T method(T var2) {return var2;}
	public void setVar1(T var1) {this.var1 = var1;}
}

public class Sample3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Gen<String> obj = new Gen<>("ABC");
		System.out.println(obj.getVar1());
		obj.setVar1("BCC");
		System.out.println(obj.getVar1());
		Gen<Integer> obj2 = new Gen<>(12);
		System.out.println(obj2.getVar1());
		obj2.setVar1(9508);
		System.out.println(obj2.getVar1());
		System.out.println(obj2.<String>method("Yui Hiroki"));
	}

}
