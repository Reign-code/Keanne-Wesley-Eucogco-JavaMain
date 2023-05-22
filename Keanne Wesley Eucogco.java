
public class Main {

	class Employee {
		
		public int employeeNumber = 100021;
		public String name;
		public String email;
		public String address;
		public String jobtitle;
		
		
		public int getEmployeeNumber() {
			return employeeNumber;
		}
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public String getAddress() {
			return address;
		}
		public String getJobtitle() {
			return jobtitle;
		}

	}
	 
	 class Attendance{
		 
		 private int daysPresent;
		 private int daysAbsent;
		 
		public int getDaysPresent() {
			return daysPresent;
		}
		public int getDaysAbsent() {
			return daysAbsent;
		}
		 
	 }
	 
	 class Salary{
		 
		 private float basicSalary;
		 
		 void calculate() {
			// calculations here
		}
	 }
	 
	 class Benefits{
		 
		 public int employeeNumber;
		 public String description;
		 public String details;
		 public int RiceSubsidy;
		 public int PhoneAllowance;
		 public int ClothingAllowance;
		 
		 void calculate() {
			 // calculations here
		 }
		 
		 void update() {
			 // update event here
		 }
		 
		 
	 }
	 
	 class Deduction{
		 
		 public String type;
		 public Double SSS;
		 public Double Pagibig;
		 public Double Philhealth;
		 private Double tax;
		
		 public String getType() {
			return type;
		 }

         }
}