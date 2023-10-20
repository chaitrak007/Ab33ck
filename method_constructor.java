//method,constructor and non static method in one program
package pakage1;

public class method_constructor {
	static void star() {
		System.out.println("plenty of stars");
	}

	void moon() {
		System.out.println("moon is a satelite ");
	}

	method_constructor() {
		System.out.println("moon and stars ");
	}

	public static void main(String[] args) {
		star();
		method_constructor a = new method_constructor();// after creating object constructor is automatically called
		a.moon();
	}

}
