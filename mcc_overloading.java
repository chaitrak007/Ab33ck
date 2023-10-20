//method and class constructor overloading
package pakage1;

public class mcc_overloading {
	mcc_overloading(){
		System.out.println("I am constructor");
	}
	
	mcc_overloading(int a){
		System.out.println("I am constructor with parameter");
	}
	
	void text_method() {
		System.out.println("I am a method");
	}
	void text_method(String q, int b,float d) {
		System.out.println("I am method with parameters");
	}
	public static void main(String[] args) {
		mcc_overloading c=new mcc_overloading();
		mcc_overloading c1=new mcc_overloading(1);
		c1.text_method();
		c1.text_method("chaitra", 2, 1.3f);
		
	}

}
