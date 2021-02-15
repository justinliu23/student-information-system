package courseregistrationsystem;

public class English
{
    //------------------------------
    // Represents the English course 
    //------------------------------

    // Department information should be known/accessible to everyone
    public String department;

    public English()
    {
        // Determines department and also identifies the department in which the specific field is located
        this.department = "E";
    }

    // Returns the department of this course as a String
    public String toString()
    {
        return this.department;
    }
}