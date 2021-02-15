package courseregistrationsystem;

public class Athletics
{
    //--------------------------------
    // Represents the Athletics course 
    //--------------------------------

    // Department information should be known/accessible to everyone
    public String department;

    public Athletics()
    {
        // Determines department and also identifies the department in which the specific field is located
        // Athletics' rooms are always printed, "GYM" on a student's schedule
        this.department = "GYM";
    }

    // Returns the department of this course as a String
    public String toString()
    {
        return this.department;
    }
}
