package pakage1;

public class sib_iib {
	
	 sib_iib() {
		                                                      //out put is SIB
		                                                      //SIB,main method,IIB,constructor
		 System.out.println(" Hi i am a constructor");
		 }
	 
	 static {
		 System.out.println("I am SIB");
	 }
	 {
		System.out.println("I am IIB");
		 
	 }

	public static void main(String[] args) {
		System.out.println(" I am your main method");
		new sib_iib();
	}

}
