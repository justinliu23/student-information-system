package courseregistrationsystem;

public class Football extends Athletics
{
    //------------------------------------------
    // Represents the Athletics course, Football
    //------------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "Football";
    public String teacher = "Kelly";

    // Space to help line up and organize courses  
    String spacing;

    public Football()
    {
        super();

        this.spacing = "\t\t";
    }

    // Returns the course's title, then the teacher's last name, followed by the course's building and room number concatenated as a string
    public String toString()
    {
        return this.course + this.spacing + this.teacher + "\t\t" + super.toString() + "\n";
    }
}