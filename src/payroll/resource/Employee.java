package payroll.resource;

/**
 * Employee class
 *
 *  The static variables contractIdCounter and permanentIdCounter should be initialized to 10000 using a static block.
 *
 *  Employee(String employeeName)
 *
 *  The instance variable employeeName should be initialized with the value passed to the constructor appropriately.
 *
 *  employeeId should be generated either using contractIdCounter static variable or permanentIdCounter static
 *  variable as follows:
 *
 *      The value of employeeId should start from 'C10001' and the numerical part should be incremented by 1 for the
 *      subsequent values, if the employee is a contract employee.
 *
 *      The value of employeeId should start from 'E10001' and the numerical part should be incremented by 1 for the
 *      subsequent values, if the employee is a permanent employee.
 *
 *  setEmployeeName(String employeeName)
 *
 *      employeeName instance variable should be set to the passed value if the passed value is valid.
 *
 *      employeeName passed is valid if it satisfies the following rules:
 *
 *      Employee name can contain only alphabets and spaces. Space is allowed only between words.
 *
 *      Name should contain minimum 2 words.
 *
 *      Each word in the employee name should contain minimum 2 alphabets and it must start with an uppercase alphabet.
 *
 *  setSalary(double salary)
 *
 *      salary instance variable should be set to the passed value if the passed value is greater than 0, else, salary
 *      instance variable should be set to 0.
 *
 *  Implement other setter and getter methods appropriately.
 * */
public abstract class Employee
{
    // helper functions/ data
    private static boolean containsDigit(String s) {return s.matches(".*\\d.*");}

    private static int contractIdCounter = 1001;
    private static int permanentIdCounter = 1001;

    protected static int getContractIdCounter(){return contractIdCounter;}
    protected static void setContractIdCounter(){contractIdCounter++;}
    protected static int getPermanentIdCounter(){return permanentIdCounter;}
    protected static void setPermanentIdCounter(){ permanentIdCounter++;}
    
    private String employeeName;
    protected String employeeId;
    private double salary;

    protected Employee(String name){setEmployeeName(name);}

    public String getEmployeeName(){return employeeName;}

    /**
     * sets the employee name to the given name
     * employeeName instance variable should be set to the passed value if the passed value is valid.
     * employeeName passed is valid if it satisfies the following rules:
     *      Employee name can contain only alphabets and spaces. Space is allowed only between words.
     *      Name should contain minimum 2 words.
     *      Each word in the employee name should contain minimum 2 alphabets and it must start with an uppercase
     *      alphabet.
     * @param name given name
     * */
    public void setEmployeeName(String name)
    {
        String [] names = name.split(" ");

        // check edge cases
        if (names.length > 2)
            return;

        if (containsDigit(names[0])||containsDigit(names[1]))
            return;
        employeeName = names[0]+" "+names[1];
    }
    public String getEmployeeId(){return employeeId;}

    public void setSalary(double s)
    {
        if (s <=0)
            salary = 0;
        else
            salary = s;
    }
    public double getSalary(){return salary;}

    /**
     * calculates salary
     * @param f experience for PermanentEmployee / hoursWorked for ContractEmployee
     * */
    protected abstract double calculateSalary(float f);

    /**
     * sets employee id
     * @param s "E" for PermanentEmployee / "C" for ContractEmployee
     * */
    protected abstract void setEmployeeId(String s);


    //Do not modify the code given below
	@Override
	public String toString() { return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName(); }
}
