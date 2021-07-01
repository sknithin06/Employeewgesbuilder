
public class Employeewages {
	public static final int isFulltime = 1;
	public static final int isParttime = 2;
	public static final int empRatePerHrs = 20;
	
	public static void main (String[] agrs) {
		System.out.println("Welcome to Empwages");
		 int isPresent = 1;
		 double empcheck = Math.floor(Math.random() * 10) % 2;
		 if (empcheck == isPresent)
		 	System.out.println("Employee is Present");
		 else
			System.out.println("Employee is Absent");
		 
		 double empHrs = 8;
		 double Salary=(empHrs * empRatePerHrs);
		 if (empcheck == isPresent)
			 System.out.println("Salary is ="+Salary);
		 else
			Salary = 0;
		 
		 double empCheck = Math.floor(Math.random() * 10) % 3;
		 if (empCheck == isFulltime) {
			 double empHr = 12;
			 double salary=(empHr * empRatePerHrs);
			 System.out.println("salary is ="+salary);
		 } 
		 else if (empCheck == isParttime) {
			double emphr = 8;
		    double salary=(emphr * empRatePerHrs);
		    System.out.println("salary is ="+salary);
		 }
		 else 
			Salary = 0;
		 
		 int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
		 int Emphrs = 0;
		 int empWages = 0;
		 switch ( EmpCheck) {
		 	case  isFulltime :
		 		  Emphrs = 8;
		 		break ;
		 	case  isParttime :
		 		 Emphrs = 4;
		 		break;
		 	default:
		 		 Emphrs = 0;
		 }
		 empWages = Emphrs * empRatePerHrs;
		 System.out.println("empwage is:"+empWages);
	}
}