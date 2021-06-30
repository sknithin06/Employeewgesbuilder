
public class Employeewages {
	public static void main (String[] agrs) {
		System.out.println("Welcome to Empwages");
		 int isPresent = 1;
		 double empcheck = Math.floor(Math.random() * 10) % 2;
		 if (empcheck == isPresent)
		 	System.out.println("Employee is Present");
		 else
			System.out.println("Employee is Absent");
		 
		 double empRatePerHrs = 20;
		 double empHrs = 8;
		 double Salary=(empHrs * empRatePerHrs);
		 if (empcheck == isPresent)
			 System.out.println("Salary is ="+Salary);
		 else
			Salary = 0;
		}
}

