package Text9;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileSystem fs = FileSystems.getDefault();
		Path path1 = fs.getPath("/Users/YUI/Desktop");
		System.out.println(path1);
		Path path2 = Paths.get("/Users/YUI/Desktop/sample.txt");
		System.out.format("%s%n", path2.getFileName());
		System.out.format("%s%n", path2.getName(0));
		System.out.format("%s%n", path2.getRoot());
		System.out.format("%s%n", path2.subpath(0,2));
		Path path3 = Paths.get("/Users/YUI/../App/../Desktop/sample.txt");
		System.out.format("%s%n", path3.normalize());
//		System.out.format("%s%n", path2.getRoot());
		System.out.format("%s%n",Files.exists(path1));
		System.out.format("%s%n",Files.exists(path2));
		System.out.format("%s%n",Files.exists(path3));
 	}

}
