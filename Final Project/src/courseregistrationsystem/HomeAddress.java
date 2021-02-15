package courseregistrationsystem;

public class HomeAddress
{
    //-------------------------------------------------------------
    // Represents a student's home address with user-specified data
    //-------------------------------------------------------------

    // Student address below must be made private - only student should know/access
    private String streetAddress, city, state;
    private int zipCode;

    public HomeAddress (String streetAddress, String city, String state, int zipCode)
    {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Returns and organizes an arbitrary student's address as a String
    public String toString()
    {
        String address;

        address = this.streetAddress + "\n";
        address += this.city + ", " + this.state + " " + this.zipCode;

        return address;
    }
}