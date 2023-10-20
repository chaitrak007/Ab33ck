package pakage1;

public class Localglobal_variable {
	int age=18;                //global variable are declared and initialized in one line
	double salary=4.5;
	String name="chaitra";
	final double bonus=2.4;
	
	void payslip() {
		double salary= 3.2;// local variable 
		int age=20;
		
		if(age>18) {
			System.out.println("employee is  eligible for salary ");
		}
	}
	
	
	
	

	public static void main(String[] args) {
	           
		double bonus= 2.5;
		Localglobal_variable l= new Localglobal_variable();
			l.payslip();
			System.out.println(l.age);
			System.out.println(l.name);
			System.out.println(l.salary);
			System.out.println(l.bonus);
		
		

	}

}
