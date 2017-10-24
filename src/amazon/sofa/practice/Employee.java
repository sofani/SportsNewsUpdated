package amazon.sofa.practice;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	 private int id;
     private String name;
     private int age;
     private long salary;
     public int getId() {
        return id;
     }

     public String getName() {
        return name;
     }

     public int getAge() {
        return age;
     }

     public long getSalary() {
         return salary;
     }

     public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
     }
//	    public int compareTo(Employee emp) {
//	        //let's sort the employee based on id in ascending order
//	        //returns a negative integer, zero, or a positive integer as this employee id
//	        //is less than, equal to, or greater than the specified object.
//	        return (this.id - emp.id);
//	    }
	    @Override
	    //this is overriden to print the user friendly information about the Employee
	    public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
	                this.salary + "]";
	    }

		@Override
		public int compareTo(Employee emp) {
			// TODO Auto-generated method stub
		 return (this.id - emp.id);
		}
	    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };
	    
	    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return e1.getName().compareTo(e2.getName());
	        }
	    };
	    
	    
	
}
