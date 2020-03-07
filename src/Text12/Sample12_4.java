package Text12;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample12_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Locale jp = Locale.getDefault();
		Locale us = new Locale("en","US");
		Locale[] localeArr = {jp,us};
		System.out.println(System.getProperty("java.class.path"));
		for(Locale lo : localeArr) {
			ResourceBundle obj = ResourceBundle.getBundle("MyResources",lo);
		System.out.println(obj.getString("send"));
		System.out.println(obj.getString("cancel"));
		}
	}

}
