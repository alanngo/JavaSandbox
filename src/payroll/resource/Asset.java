package payroll.resource;

/**
 * Asset(String assetId, String assetName, String assetExpiry)
 *
 * The instance variables should be initialized with the values passed to the constructor appropriately.
 *
 * setAssetId(String assetId)
 *
 * assetId instance variable should be set to the passed value if the passed valued is valid.
 *
 * assetId passed is valid if it satisfies the following rules:
 *  - assetId should start with either "DSK" or "LTP" or "IPH"
 *  - followed by a hyphen (-) and 6 digits and a character which should be either 'H' or 'L' (case-insensitive).
 *
 * Implement other setter and getter methods appropriately.*/
public class Asset
{

    // helper functions
    private static boolean validate(String s, String [] valid)
    {
        for (String v: valid)
        {
            if (s.equals(v))
                return true;
        }
        return false;
    }
    private static boolean validate(String s)
    {
        try
        {
            int intValue = Integer.parseInt(s);
            if (intValue >= 100000 && intValue <=999999)
                return true;
        }
        catch(Exception e)
        {
            return false;
        }
        return false;
    }
    private static boolean validateIgnoreCase(String s, String [] valid)
    {
        for (String v: valid)
        {
            if (s.equalsIgnoreCase(v))
                return true;
        }
        return false;
    }
    private static boolean validateAssetID(String id)
    {
        //TODO
        String prefix = id.substring(0, 3);
        String hyphen = id.substring(3, 4);
        String sixDigits = id.substring(4, 10);
        String suffix = id.substring(10);

        return validate(prefix, new String[]{"DSK", "LTP", "IPH"})
                && validate(hyphen, new String[]{"-"})
                && validate(sixDigits)
                &&validateIgnoreCase(suffix, new String[]{"H", "L"});
    }


    //Implement your code here
    private  String assetId;
    private final String assetName;
    private final String assetExpiry;

    public Asset(String id, String name, String expiry)
    {
        setAssetId(id);
        assetName=name;
        assetExpiry=expiry;
    }
    public String getAssetId(){return assetId;}
    public String getAssetName(){return assetName;}
    public String getAssetExpiry(){return assetExpiry;}

    public void setAssetId(String id)
    {
        if (validateAssetID(id))
            assetId = id;
        else
            throw new IllegalArgumentException("invalid id "+ id);
    }

    //Do not modify the code given below
    @Override
	public String toString()
    {
		return "Asset Id: "+getAssetId()+
                ", Asset Name: "+getAssetName()+
                ", Asset Expiry: "+getAssetExpiry();
	}
}
