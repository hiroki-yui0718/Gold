
final class Exam5 { //不変クラス
	private final int id; //変更でいなようにfinal修飾子

	public Exam5(int id) {
		this.id = id;
	}
	public int getId() { //ゲッターは提供するがセッターは提供しない
		return this.id;
	}
}


