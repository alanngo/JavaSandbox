package payroll.resource;

/**
 * InvalidAssetsException class
 *
 * InvalidAssetsException(String message)
 *
 * The instance variable should be initialized with the value passed to the constructor appropriately.
 * */
public class InvalidAssetsException extends RuntimeException
{
    InvalidAssetsException(String message){super(message);}
}
