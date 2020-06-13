package payroll.resource;
/**
 * ContractEmployee class
 *
 *  ContractEmployee(String employeeName, double wagePerHour)
 *      The inherited member variables should be initialized by invoking the base class constructor.
 *
 *      The member variable of ContractEmployee class should be initialized with the value passed to the
 *      constructor appropriately.
 *
 *  calculateSalary(float hoursWorked)
 *
 *      The value of salary should be calculated using the formula given below:
 *
 *      salary = wagePerHour * hoursWorked
 *
 *      hoursWorked should be validated and checked whether it is greater than or equal to 190
 *
 *      If hoursWorked is less than 190, a portion of the salary should be deducted as per the following:
 *
 *          salary to be deducted will be the product of half of the wagePerHour and the number of hours less than the
 *          limit, i.e., 190.
 *
 *      The calculated salary should be rounded to the nearest integer and should be set to the instance
 *      variable salary.
 *
 *  Implement the setter and getter methods appropriately.
 * */
public class ContractEmployee extends Employee
{
    private final double wagePerHour;

    public ContractEmployee(String employeeName, double wagePerHour)
    {
        super(employeeName);
        this.wagePerHour = wagePerHour;
        super.setSalary(calculateSalary((float) wagePerHour));
        setEmployeeId("C");
    }
    public double getWagePerHour(){return wagePerHour;}

    @Override
    protected double calculateSalary(float hoursWorked)
    {
        double salary = wagePerHour * hoursWorked;

        if (hoursWorked < 190)
            salary = .5 * wagePerHour *hoursWorked;

        return salary;
    }

    /**
     * The value of employeeId should start from 'C10001' and the numerical part should be incremented by 1 for the
     * subsequent values, if the employee is a contract employee.
     * */
    @Override
    protected void setEmployeeId(String s)
    {
        employeeId = s + getContractIdCounter();
        setContractIdCounter();
    }

    //Uncomment the code given below after implementing the class
    //Do not modify the code given below
	@Override
	public String toString() { return super.toString()+ ", Wage Per Hour: "+getWagePerHour(); }
}
