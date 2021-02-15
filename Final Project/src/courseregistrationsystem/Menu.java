package courseregistrationsystem;

import java.util.Scanner;
import java.io.IOException;

public class Menu
{
    //----------------------------------
    // Represents a menu/UI for the user
    //----------------------------------

    // Account identifiers for a student when logging in
    static int studentID;
    static String studentPassword;

    // Boolean to determine if the student has displayed or edited their information yet
    // Need to use so scan.nextLine() won't falter and run twice in the save method
    static boolean editedOrSaved = false;

    // Method that simulates a course registration system
    public static void loginAndBrowse() throws IOException
    {
        Scanner scan = new Scanner (System.in);

        Student student = new Student();
        Admin admin = new Admin();

        // Boolean to determine if the user is still choosing an option from the menu
        boolean choosing = true;

        // Boolean to determine if the user is logged into their account
        boolean loggingIn = true;

        // Boolean to determine if the student has registered yet
        boolean registered = false;

        // The user's input when selecting an option
        int choice;

        // Number of attempts at logging in
        int loginAttempt = 1;

        // Input from the admin when trying to logging in
        String adminUsername = "";
        String adminPassword = "";

        // Ask user if they are an administrator or student
        System.out.println("\n-------------------------");
        System.out.println("Admin [1] or Student [2]");
        System.out.println("-------------------------");
        int accountType = scan.nextInt();

        // *******************************************************************************************
        // Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
        // *******************************************************************************************

        // Admin
        if (accountType == 1)
        {
            // Instantiate an instance of the AdminAccounts class for reference of valid credentials when trying to log in 
            AdminAccounts adminAccounts = new AdminAccounts();

            // While the user is still trying to log in
            while (loggingIn)
            {
                // Prompt admin for their username and password
                System.out.println("\nUsername:");

                // Only need to use scan.nextLine() to convert from int to String the first time when attempting to log in
                if (loginAttempt == 1)
                {
                    scan.nextLine();
                    adminUsername = scan.nextLine();
                }
                else
                {
                    adminUsername = scan.nextLine();
                }

                System.out.println("Password:");
                adminPassword = scan.nextLine();

                // Boolean to determine if the user needs to try again and if the try again message needs to be displayed
                boolean tryAgain = true;

                // Check to see if username and password are valid by using the adminAccounts as reference
                for (int i = 0; i < adminAccounts.getNumAccounts(); i++)
                {
                    String validUsername = adminAccounts.getUsername(i);
                    String validPassword = adminAccounts.getPassword(i);

                    if (adminUsername.equalsIgnoreCase(validUsername) && adminPassword.equals(validPassword))
                    {
                        AdminMenu.credentialsAccepted();
                        loginAttempt++;
                        loggingIn = false;
                        // Set the try again boolean to false if the login was successful and admin doesn't need to try again
                        tryAgain = false;
                        // Break after successfully logging in, as there is no point in continuing to loop and check
                        break;
                    }
                    else
                    {
                        loginAttempt++;
                    }
                }

                // If the try again boolean was not made true, display the try again message
                if (tryAgain)
                {
                    AdminMenu.tryAgain();
                }
            }

            // Instantiate premade, random students for the admin to manage
            admin.instantiateStudents();
            AdminMenu.display();
            choice = scan.nextInt();

            while (choosing)
            {
                // Display accounts
                if (choice == 1)
                {
                    admin.display();
                    AdminMenu.display();
                    choice = scan.nextInt();    
                }
                // Search account(s)
                else if (choice == 2)
                {
                    admin.search();
                    AdminMenu.display();
                    choice = scan.nextInt();    
                }
                // Edit account
                else if (choice == 3)
                {
                    admin.edit();
                    AdminMenu.display();
                    choice = scan.nextInt();
                }
                // Add account
                else if (choice == 4)
                {
                    admin.add();
                    AdminMenu.display();
                    choice = scan.nextInt();
                }
                // Remove account
                else if (choice == 5)
                {
                    admin.remove();
                    AdminMenu.display();
                    choice = scan.nextInt();
                }
                // Save accounts
                else if (choice == 6)
                {
                    admin.save();
                    AdminMenu.display();
                    choice = scan.nextInt();
                }
                // Log off
                else if (choice == 7)
                {
                    AdminMenu.logOff();
                    choosing = false;
                }
                else
                {
                    // As long as the admin inputs an invalid option, keep prompting them to try again
                    while (choice >= 8)
                    {
                        AdminMenu.invalidSelection();  
                        choice = scan.nextInt();
                    }
                }
            }
        }

        // Student
        else if (accountType == 2)
        {
            // Prompt student for their id and password
            System.out.println("\nID:");
            studentID = scan.nextInt();

            System.out.println("Password:");
            scan.nextLine();
            studentPassword = scan.nextLine();

            StudentMenu.displayBeforeRegistered();
            choice = scan.nextInt();

            while (choosing)
            {
                // If student hasn't registered yet
                while (!registered)
                {
                    // Register account
                    if (choice == 1)
                    {
                        student.register();
                        registered = true;
                        StudentMenu.displayAfterRegistered();
                        choice = scan.nextInt();    
                    }
                    // Log off
                    else if (choice == 2)
                    {
                        StudentMenu.logOff();
                        choosing = false;
                        // Needed to add a break statement to prevent an infinite loop of logging out
                        break;
                    }
                    // As long as the user inputs an invalid option, keep prompting them to try again
                    else
                    {
                        while (choice >= 3)
                        {
                            StudentMenu.invalidSelection();
                            choice = scan.nextInt();
                        }
                    }
                }

                while (registered)
                {
                    // Display info
                    if (choice == 1)
                    {
                        student.display();
                        StudentMenu.displayAfterRegistered();
                        choice = scan.nextInt();    
                    }
                    // Edit info
                    else if (choice == 2)
                    {
                        student.edit();
                        editedOrSaved = true;
                        StudentMenu.displayAfterRegistered();
                        choice = scan.nextInt();
                    }
                    // Save info
                    else if (choice == 3)
                    {
                        student.save();
                        editedOrSaved = true;
                        StudentMenu.displayAfterRegistered();
                        choice = scan.nextInt();
                    }
                    // Log off
                    else if (choice == 4)
                    {
                        StudentMenu.logOff();
                        choosing = false;
                        // Needed to add a break statement to prevent an infinite loop of logging out
                        break;
                    }
                    // As long as the user inputs an invalid option, keep prompting them to try again
                    else
                    {
                        while (choice >= 5)
                        {
                            StudentMenu.invalidSelection();
                            choice = scan.nextInt();
                        }
                    }
                }
            }
        }

        // Invalid Selection
        else if (accountType != 1 && accountType != 2)
        {
            System.out.println("\nInvalid selection. Please try again.\n");

            // Implementation of recursion to bring user back to the start
            loginAndBrowse();
        }
    }

    // Method used when instantiating a new student object since the ID is based upon the initial user input at the startup menu
    public static int getID()
    {
        return studentID;
    }

    // Method used when instantiating a new student object since the password is based upon the initial user input at the startup menu
    public static String getPassword()
    {
        return studentPassword;
    }

    // Method to return whether or not the student information has been edited or saved yet
    public static boolean getEditedOrSaved()
    {
        return editedOrSaved;
    }
}