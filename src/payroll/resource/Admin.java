package payroll.resource;
/**
 *
 * Admin class
 *
 *  generateSalarySlip(Employee[] employees, float[] salaryFactor)
 *
 *      The calculateSalary() method of the appropriate Employee class should be invoked by passing the corresponding
 *      value from the salaryFactor array.
 *
 *      The salaryFactor array contains float values which are either hoursWorked or experience.
 *
 *      There is one to one mapping between the employees array and the salaryFactor array.
 *
 *  generateAssetsReport(Employee[] employees, String lastDate)
 *
 *      The total number of allocated assets whose expiry is on or before the lastDate passed to the method for all the
 *      employees present in the employees array should be returned
 *
 *      For calculating the total number of allocated assets, getAssetsByDate() method of the PermanentEmployee class by
 *      should be invoked by passing the lastDate if the employee is a permanent employee.
 *
 *      If InvalidAssetsException is thrown by the getAssetsByDate() method, the InvalidAssetsException exception should
 *      be handled and -1 should be returned
 *
 *      Assumption: employees array will contain contract employees and permanent employees who are allocated with
 *      assets.
 *
 *  generateAssetsReport(Employee[] employees, char assetCategory)
 *
 *      The assetIds of all the allocated assets whose assetId starts with the given character for all the employees
 *      present in the employees array should be returned. Case-insensitive comparison should be performed.
 *
 *      The length of the array being returned should be thrice the length of employees array.
 *
 *  Assumption: employees array will contain contract employees and permanent employees who are allocated with assets.
 * */
public class Admin
{
    public Admin(){}

    public void generateSalarySlip(Employee[] employees, float[] salaryFactor)
    {
        //TODO
    }

    public int generateAssetsReport(Employee[] employees, String lastDate)
    {
        //TODO
        return 0;
    }

    public String[] generateAssetsReport(Employee[] employees, char assetCategory)
    {
        //TODO
        return null;
    }
}
