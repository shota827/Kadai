package animal;

public class Human extends Animal implements Thinkable {

	// 趣味を表す変数
	private String hobby;

	public Human() {
	}

	public Human(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	@Override
	public void think() {
		System.out.println("私は" + hobby + "について考えています。");
	}
}
