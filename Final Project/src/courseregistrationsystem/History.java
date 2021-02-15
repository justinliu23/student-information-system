package courseregistrationsystem;

public class History
{
    //------------------------------
    // Represents the History course 
    //------------------------------

    // Department information should be known/accessible to everyone
    public String department;

    public History()
    {
        // Determines department and also identifies the department in which the specific field is located
        this.department = "H";
    }

    // Returns the department of this course as a String
    public String toString()
    {
        return this.department;
    }
}