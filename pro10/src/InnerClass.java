/**
 * 成员内部类
 * 格式 外部类.内部类 = 外部类对象.内部类对象
 *     Outer.Inner i = new Outer().new Inner();
 */
class Outer {
	private int num = 10;

	class Inner {
		public void show() {
			System.out.println(num);
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.show();
	}
}
