package courseregistrationsystem;

public class AdminMenu
{
    //-----------------------------------------------------------------------------------------------------------
    // Represents instructions, messages, feedback, directions, and statements that appear within an admin's menu
    //-----------------------------------------------------------------------------------------------------------

    // Message/Menu when admin's credentials have been accepted
    public static void credentialsAccepted()
    {
        System.out.println("\nCredentials Accepted.");
    }

    // Message/Menu displayed for an admin
    public static void display()
    {
        System.out.println("\n---------------------------------------");
        System.out.println("Display [1]");
        System.out.println("Search  [2]");
        System.out.println("Edit    [3]");
        System.out.println("Add     [4]");
        System.out.println("Delete  [5]");
        System.out.println("Save    [6]");
        System.out.println("Log off [7]");
        System.out.println("---------------------------------------");
    }

    // Message/Menu when admin makes an invalid selection
    public static void invalidSelection()
    {
        System.out.println("\nInvalid selection. Please try again.");   
    }

    // Message/Menu when admin needs to try again
    public static void tryAgain()
    {
        System.out.println("\nPlease try again.");
    }

    // Message/Menu when admin logs off
    public static void logOff()
    {
        System.out.println("\n-----------");
        System.out.println("Logged Off");
        System.out.println("-----------");
    }
}