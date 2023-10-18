package package2;

import java.util.Scanner;

public class Arithmatic_Operator_1 {
	
	 void addition(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		int add=a+b;
		System.out.println(add);
		//s1.close();
		
	}
void subtraction(){
	Scanner s1 = new Scanner(System.in);
	System.out.println("enter the value of c");
	int c=s1.nextInt();
	System.out.println("enter the value of d");
	int d=s1.nextInt();
	int sub=c-d;
	System.out.println(sub);
	//s1.close();
		
	}
 void multiplication(){
	Scanner s3 = new Scanner(System.in);
	System.out.println("enter the value of e");
	int e=s3.nextInt();
	System.out.println("enter the value of f");
	int f=s3.nextInt();
	int mul=e*f;
	System.out.println(mul);
	//s3.close();
	
}
 void division(){
	Scanner s4 = new Scanner(System.in);
	System.out.println("enter the value of g");
	int g=s4.nextInt();
	System.out.println("enter the value of h");
	int h=s4.nextInt();
	int div=g/h;
	System.out.println(div);
	s4.close();
	
}
	public static void main(String[] args) {
		Arithmatic_Operator_1 a= new Arithmatic_Operator_1();
		//addition();
		
		a.subtraction();
		a.multiplication();
		a.division();
		
		

	}

}
