package courseregistrationsystem;

import java.io.IOException;

public class CourseRegistration
{
    //---------------------------------------
    // Simulates a course registration system
    //---------------------------------------

    // Throws IO Exception because the saving methods of both student and admin require an IO Exception to be thrown
    public static void main (String[] args) throws IOException
    {
        // Welcome message
        System.out.println("\t\t\t\t\t\t\t  Welcome to Ridgemont High Course Registration!");

        // Run method that simulates a course registration system
        Menu.loginAndBrowse();
    }
}