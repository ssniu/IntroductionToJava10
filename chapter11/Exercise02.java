/**
 * (The Person, Student, Employee, Faculty, and Staff classes)
 * Design a class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee.
 * A person has a name, address, phone number, and email address.
 * A student has a class status (freshman, sophomore, junior, or senior).
 * Define the status as a constant.
 * An employee has an office, salary, and date hired.
 * Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired.
 * A faculty member has office hours and a rank.
 * A staff member has a title. Override the toString method in each class to
 * display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them.
 * Write a test program that creates a Person, Student, Employee, Faculty,
 * and Staff, and invokes their toString() methods.
 *
 */

 /************************************************
  *                  UML                         *
  *                Person                        *
  *----------------------------------------------*
  * -name: String
  * -address: String
  * -phoneNumber: String
  * -email:String
  * +Person()
  * +Person(n:String, a:String, p:String, e:String)
  * +getName():
  * +getAddress()
  * +getPhone()
  * +getEmail():
  * +setName(n:String)
  * +setAddress(a:String)
  * +setPhone(p:String)
  * +setEmail(e:String):
  * +toString()
  *
  *************************************************/
  class Person{
    //Date fields
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    //no-args constructor
    public Person(){
    }
    //Constructor with all variables
    public Person(String n, String a, String p, String e){
      name = n;
      address = a;
      phoneNumber = p;
      email = e;
    }
    //Setter and getter methods
    public String getName(){
      return name;
    }
    public String getAddress(){
      return address;
    }
    public String getPhone(){
      return phoneNumber;
    }
    public String getEmail(){
      return email;
    }

    public void setName(String n){
      name = n;
    }
    public void setAddress(String a){
      address = a;
    }
    public void setPhone(String p){
      phoneNumber = p;
    }
    public void setEmail(String e){
      email = e;
    }
    //toString() method
    public String toString(){
      return "\nName is " + this.name + " \naddress is " + this.address
              + " \nphone number is " + this.phoneNumber + " \nemail is " + this.email;
    }
  }

  /************************************************
   *                  UML                         *
   *                Student                       *
   *----------------------------------------------*
   * -status: int
   * +Student(n:String, a:String, p:String, e:String, status:int)
   * +getStatus():String
   * +setStatus(s:int): void
   * +toString()
   *
   *************************************************/

   class Student extends Person{
     private int status;
     public final static int FRESHMAN = 1;
     public final static int SOPHOMORE = 2;
     public final static int JUNIOR = 3;
     public final static int SENIOR = 4;

     public Student(String n, String a, String p, String e, int s){
       super(n, a, p, e);
       status = s;
     }
     //Setter and getter methods
     public String getStatus(){
       switch(status){
         case 1: return "freshman"; break;
         case 2: return "sophomore"; break;
         case 3: return "junior"; break;
         case 4: return "senior"; break;
       }
     }
     public void setStatus(int i){
       status = i;
     }

     public String toString(){
       return return "\nName is " + this.name + " \naddress is " + this.address
               + " \nphone number is " + this.phoneNumber + " \nemail is "
               + this.email + "\n status is " + status;
     }
   }

   /************************************************
    *                  UML                         *
    *                Employee                      *
    *----------------------------------------------*
    * -office:int
    * -salary: double
    * -dateHired: MyDate
    * +Employee(n:String, a:String, p:String, e:String, o:int, sa:double, d:MyDate)
    * +getOffice():int
    * +getSalary():double
    * +getDateHired(): MyDate
    * +setOffice(o:int):void
    * +setSalary(s:double):void
    * +setDateHired(da:MyDate): void
    * +toString()
    *
    *************************************************/

    class Employee extends Person{
      private int office;
      private double salary;
      private MyDate dateHired;

      public Employee(String n, String a, String p, String e,
               int o, double sa, MyDate da){
        super(n, a, p, e);
        office = o;
        salary = sa;
        da = new MyDate();
      }
      //Setter and getter methods
      public int getOffice(){
        return office;
      }
      public String getSalary(){
        return String.format("%.2f", salary);
      }
      public MyDate getDateHired(){
        return return dateHired.getMonth() + "/" + dateHired.getDay()
				 + "/" + dateHired.getYear();
      }

      public int setOffice(int i){
        office = i;
      }
      public double setSalary(double sa){
        salary = sa;
      }
      public void setDateHired(){
        dateHired = new MyDate();
      }

      public String toString(){
        return super.toString() + "\nOffice: " + office +
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
      }
    }

    /************************************************
     *                  UML                         *
     *                Faculty                       *
     *----------------------------------------------*
     * -officeHours: int
     * -rank: String
     * +Faculty(name: String, address: String, phone: String,
     *  email: String, office: int, salary: double,
     *  officeHours: int, rank: String)
     * +getOfficeHours(): int
     * +setOfficeHours(officeHours: int): void
     * +getRank(): String
     * +setRank(rank: String): void
     * +toString():String
     *
     *************************************************/

     class Faculty extends Employee{
       private int officeHours;
       private String rank;

       public Faculty(String n, String a, String p, String e,
                int o, double sa, MyDate da, int oh, String rank){
                  super(n, a, p, e, o, sa, da);
                  officeHours = oh;
                  this.rank = rank;
          }
          //Setter ang getter methods
       public int getOfficeHours(){
         return officeHours;
       }
       public String getRank(){
         return rank;
       }

       public void setOfficeHours(int i){
         officeHours = i;
       }
       public void setRank(String s){
         rank = s;
       }

       public String toString(){
         return super.toString() + "\nOffice hours: " + officeHours +
		       "\nRank: " + rank;
       }
     }

     /************************************************
      *                  UML                         *
      *                Staff                         *
      *----------------------------------------------*
      * -title: String
      * +Staff(name: String, address: String, phone: String, email: String,
      *  office: int, salary: double, dateHired: MyDate, title: String)
      * +getTitle(): String
      * +setTitle(title: String): void
      * +toString(): String
      *
      *************************************************/

  class Staff extends Employee{
    private String title;
    public Staff(String name, String address, String phone,
		        String email, int office, double salary, String title) {
		  super(name, address, phone, email, office, salary);
		  this.title = title;
	   }
    //Setter and getter methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}

public class Exercise02 {
	// Main method
	public static void main(String[] args) {
    //Create objects for all classes
		Person person = new Person("Sam", "101 first street",
			"3012785555", "sam2001@yahoo.com");

		Student student = new Student("Fio", "56 willison blvd", "8622379999",
			"fio2002@yahoo.com", Student.JUNIOR);

		Employee employee = new Employee("Kim", "1005 rock rd", "3012784563",
			"kim2003@yahoo.com", 1015, 55000);

		Faculty faculty = new Faculty("Mark", "563 rochest ct", "8622374587",
			"mark2005@yahoo.com", 654, 75000, "2pm to 4pm", "Professor");

		Staff staff = new Staff("Joo", "657 rchi dr", "8522467896",
			"joo2006@yahoo.com", 301, 60000, "HR");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
