package Text8;

import java.io.Console;
import java.io.PrintWriter;

public class Sample8_11 {
	public static void main(String[] args) {
		Console console = System.console(); //コンソールを使う
		PrintWriter pw = console.writer();
		String str = console.readLine();
		pw.append("入力されたデータ:" + str);
		pw.flush();
	}
}
