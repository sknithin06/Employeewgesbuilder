
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
		 
		 int isFulltime = 1;
		 int isParttime = 2;
		 double empCheck = Math.floor(Math.random() * 10) % 3;
		 double empRatePerHr = 20;
		 if (empCheck == isFulltime) {
			 double empHr = 12;
			 double salary=(empHr * empRatePerHr);
			 System.out.println("salary is ="+salary);
		 } 
		 else if (empCheck == isParttime) {
			double emphr = 8;
		    double salary=(emphr * empRatePerHr);
		    System.out.println("salary is ="+salary);
		 }
		 else 
			Salary = 0;
	}
}

