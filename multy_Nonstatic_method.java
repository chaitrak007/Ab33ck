//assignment5
package pakage1;

public class multy_Nonstatic_method {

	public static void main(String[] args) {
	
	multy_Nonstatic_method s=new multy_Nonstatic_method();
     s.subtract();
     s.subtract(2);
     subtract(1.65f);
	}
	
	void subtract() {
		
		System.out.println("subtract me");
	}
	
	void subtract(int a) {
		
		System.out.println("subtract me twice");
	}
	
     static void subtract(float y) {
    	 
	    System.out.println("subtract me thrice");
}
}
