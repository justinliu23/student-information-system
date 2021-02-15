package courseregistrationsystem;

public class Science
{
    //------------------------------
    // Represents the Science course 
    //------------------------------

    // Department information should be known/accessible to everyone
    public String department;

    public Science()
    {
        // Determines department and also identifies the department in which the specific field is located
        this.department = "S";
    }

    // Returns the department of this course as a String
    public String toString()
    {
        return this.department;
    }
}