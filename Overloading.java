package pakage1;

public class Overloading {
 static void add() {
	 
	 System.out.println("add1");
 }
static void add(int a) {
	 
	 System.out.println("add2");
 }

static void add(int a,int b) {
	 
	 System.out.println("add3");
	
}
static void add(int a,char b) {
	 
	 System.out.println("add4");
}
static void add(char a, int b) {
	 
	 System.out.println("add5");
}
static void add(double c) {
	 
	 System.out.println("add6");
}
static void add(String a ,int v) {
	 
	 System.out.println("add7");
}
	public static void main(String[] args) {
		
     add("chaitra", 2);
     add();
     add('c',6);
     add(2,7);
     add(3.4565565);
	
	
	}

}
