package courseregistrationsystem;

public class StudentMenu
{
    //------------------------------------------------------------------------------------------------------------
    // Represents instructions, messages, feedback, directions, and statements that appear within a student's menu
    //------------------------------------------------------------------------------------------------------------

    // Message/Menu when student has not yet registered
    public static void displayBeforeRegistered()
    {
        System.out.println("\n---------------------------------------");
        System.out.println("Register [1]");
        System.out.println("Log off  [2]");
        System.out.println("---------------------------------------");
    }

    // Message/Menu when student has registered
    public static void displayAfterRegistered()
    {
        System.out.println("\n---------------------------------------");
        System.out.println("Display [1]");
        System.out.println("Edit    [2]");
        System.out.println("Save    [3]");
        System.out.println("Log off [4]");
        System.out.println("---------------------------------------");
    }

    // Message/Menu when student makes an invalid selection
    public static void invalidSelection()
    {
        System.out.println("\nInvalid selection. Please try again.\n");   
    }

    // Message/Menu when student logs off
    public static void logOff()
    {
        System.out.println("\n-----------");
        System.out.println("Logged Off");
        System.out.println("-----------");
    }
}