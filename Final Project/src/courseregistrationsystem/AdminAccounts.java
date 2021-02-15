package courseregistrationsystem;

import java.util.ArrayList;

public class AdminAccounts
{
    //----------------------------------------
    // Represents all the valid admin accounts
    //----------------------------------------

    // Create an ArrayList that holds 5 valid admin credentials
    ArrayList<Credentials> adminAccounts = new ArrayList<Credentials>(5);

    public AdminAccounts()
    {
        Credentials credentials1 = new Credentials ("admin1", "admin1password");
        Credentials credentials2 = new Credentials ("admin2", "admin2password");
        Credentials credentials3 = new Credentials ("admin3", "admin3password");
        Credentials credentials4 = new Credentials ("admin4", "admin4password");
        Credentials credentials5 = new Credentials ("admin5", "admin5password");

        adminAccounts.add(0, credentials1);
        adminAccounts.add(1, credentials2);
        adminAccounts.add(2, credentials3);
        adminAccounts.add(3, credentials4);
        adminAccounts.add(4, credentials5);
    }

    // Method to retrieve the number of valid admin accounts
    public int getNumAccounts()
    {
        return adminAccounts.size();
    }

    // Method to retrieve an admin username from a certain account
    public String getUsername(int index)
    {
        Credentials credentialNum = adminAccounts.get(index);
        String validUsername = credentialNum.getUsername();
        return validUsername;
    }

    // Method to retrieve an admin password from a certain account
    public String getPassword(int index)
    {
        Credentials credentialNum = adminAccounts.get(index);
        String validPassword = credentialNum.getPassword();
        return validPassword;
    }
}