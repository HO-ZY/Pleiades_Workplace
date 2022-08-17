package Test01.MavenProjectTest01;

public class Main01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyClass A = new MyClass("JUNYI");
		A.getInfo();

	}

}

class MyClass{
	private String string;
	private final static String NU = "Hello : ";
	MyClass(String string) {
		this.string = string;
	}
	
	public void getInfo() {
		System.out.println(NU + this.string);
	}
}
