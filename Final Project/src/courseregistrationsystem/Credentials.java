package courseregistrationsystem;

public class Credentials
{
    //-----------------------------------------------------
    // Represents all the valid admin accounts' credentials
    //-----------------------------------------------------

    // Credentials below must all be made private - only admins should know/access
    private String username, password;

    // Constructor for admin credentials that takes in a username and password
    public Credentials (String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    // Method to retrieve an admin username
    public String getUsername()
    {
        return this.username;
    }

    // Method to retrieve an admin password
    public String getPassword()
    {
        return this.password;
    }
}