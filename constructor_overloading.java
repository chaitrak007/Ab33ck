package pakage1;

public class constructor_overloading {
	
	constructor_overloading(){
		 System.out.println("hi i am constructor");
	}
	constructor_overloading(int a){
		System.out.println("constructor with one parameter");
	}
	constructor_overloading(int a,int b){
		System.out.println("constructoe with two parameters");
	}

	public static void main(String[] args) {
		constructor_overloading c1=new constructor_overloading();
		constructor_overloading c2=new constructor_overloading(1);
		constructor_overloading c3= new constructor_overloading(1,2);

	}

}
