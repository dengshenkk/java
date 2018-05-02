
class Body {
	Boolean isDoctor = Math.random() < 0.5 ? false : true;

	private class Heart {
		private void show() {
			System.out.println("心脏在这里");
		}
	}

	public void method() {
		if (this.isDoctor) {
			Heart h = new Heart();
			h.show();
		} else {
			System.out.println("你不能查看里面的东西");
			return;
		}

	}

}

public class Person {
	public static void main(String[] args) {
		Body b = new Body();
		b.method();
	}
}
