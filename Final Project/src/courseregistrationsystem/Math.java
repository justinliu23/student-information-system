package courseregistrationsystem;

public class Math
{
    //---------------------------
    // Represents the Math course 
    //---------------------------

    // Department information should be known/accessible to everyone
    public String department;

    public Math()
    {
        // Determines department and also identifies the department in which the specific field is located
        this.department = "M";
    }

    // Returns the department of this course as a String
    public String toString()
    {
        return this.department;
    }
}