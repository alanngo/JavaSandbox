package payroll.resource;

import java.util.*;
/**
 * PermanentEmployee class
 *
 * PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets)
 *
 *      The inherited member variables should be initialized by invoking the base class constructor.
 *
 *      The member variables of PermanentEmployee class should be initialized with the values passed to the constructor
 *      appropriately.
 *
 * calculateBonus(float experience)
 *
 *      Bonus amount should be calculated and returned as per the table given below
 *
 *      If the value of experience is invalid, InvalidExperienceException should be thrown with the message
 *      "A minimum of 2.5 years is required for bonus!"
 *
 * calculateSalary(float experience)
 *
 *      The instance variable experience should be set using the value passed to the method.
 *
 *      The salary should be calculated using the formula given below:
 *
 *      salary = basicPay + DA component + HRA component + bonus amount
 *
 *      DA component and HRA component should be calculated based on the percentage value associated with each
 *      component given in the salaryComponents array.
 *
 *      E.g. - If the salaryComponents is ["DA-50", "HRA-45"], DA is 50% of the basicPay and HRA is 45% of the basicPay.
 *
 *      The bonus amount should be calculated by invoking the calculateBonus() method
 *
 *      If InvalidExperienceException is thrown  by the calculateBonus() method, the InvalidExperienceException
 *      exception should be handled and bonus amount should be set to 0
 *
 *      The calculated salary should be rounded to the nearest integer and should be set to the instance variable
 *      salary.
 *
 * getAssetsByDate(String lastDate)
 *
 *      An Asset array (Asset[]) containing all the allocated assets whose expiry is on or before the lastDate passed
 *      to the method should be returned.
 *
 *      The length of the array being returned should be same as that of total number of assets allocated to the
 *      employee.
 *
 *      If there are no allocated assets whose expiry is on or before the lastDate passed to the method,
 *      InvalidAssetsException should be thrown with the message "No assets found for the given criteria!"
 *
 *      HINT:
 *
 *      The dates will be in the following String format: "YYYY-MON-DD". E.g. - "2023-Dec-05"
 *
 *      getMonth() method of the Resources class should be invoked for validating the month
 *
 * Implement the setter and getter methods appropriately.*/
public class PermanentEmployee extends Employee
{
    private double basicPay;
    private String[] salaryComponents;
    private Asset[] assets;
    private float experience;
    public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets)
    {
        super(employeeName);
        this.basicPay = basicPay;
        this.salaryComponents = salaryComponents;
        this.assets = assets;
        setEmployeeId("E");
    }

    @Override
    protected double calculateSalary(float experience)
    {
        //TODO
        return 0;
    }

    /**
     * The value of employeeId should start from 'E10001' and the numerical part should be incremented by 1 for the
     * subsequent values, if the employee is a permenant employee.
     * */
    @Override
    protected void setEmployeeId(String s)
    {
        employeeId = s + getPermanentIdCounter();
        setPermanentIdCounter();
    }
    /**
     * @param experience: years of experience
     * @throws InvalidExperienceException
     * Bonus amount should be calculated and returned as per the table given below
     * If the value of experience is invalid, InvalidExperienceException should be thrown with the message
     * "A minimum of 2.5 years is required for bonus!"
     * */
    private static double calculateBonus(float experience)
    {
        if (experience<2.5)
            throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");

        //TODO
        return 0;
    }

    public double getBasicPay(){return basicPay;}
    public float getExperience(){return experience;}
    public String[] getSalaryComponents(){return salaryComponents;}
    public Asset[] getAssets(){return assets;}

    /**
     * An Asset array (Asset[]) containing all the allocated assets whose expiry is on or before the lastDate passed
     * to the method should be returned.
     *
     * The length of the array being returned should be same as that of total number of assets allocated to the
     * employee.
     * If there are no allocated assets whose expiry is on or before the lastDate passed to the method,
     * InvalidAssetsException should be thrown with the message "No assets found for the given criteria!"
     *
     *
     * HINT: The dates will be in the following String format: "YYYY-MON-DD". E.g. - "2023-Dec-05"
     * getMonth() method of the Resources class should be invoked for validating the month
     *
     * @param lastDate: date of the asset
     * @return assets that contain a certain date
     * @throws InvalidExperienceException
     * */
    public Asset[] getAssetsByDate(String lastDate)
    {
        //TODO
        List<Asset> ret = new ArrayList<>();
        for (Asset a: assets)
        {
            int assetMonth = Resources.getMonth(a.getAssetExpiry().substring(5, 8));
            int month = Resources.getMonth(lastDate.substring(5, 8));
            if (month <= assetMonth)
                ret.add(a);
        }
        if (ret.size()<=0)
            throw new InvalidAssetsException("No assets found for the given criteria!");

        return ret.toArray(new Asset[ret.size()]);
    }
    //Uncomment the code given below after implementing the class
    //Do not modify the code given below
	@Override
	public String toString()
    {
		return super.toString()+
                ", Basic Pay: "+getBasicPay()+
                ", Salary Components: "+ Arrays.toString(getSalaryComponents()) +
                ", Assets: "+ Arrays.toString(getAssets());
	}
}
