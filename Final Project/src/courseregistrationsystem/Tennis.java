package courseregistrationsystem;

public class Tennis extends Athletics
{
    //----------------------------------------
    // Represents the Athletics course, Tennis
    //----------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "Tennis";
    public String teacher = "Hoeger";

    // Space to help line up and organize courses  
    String spacing;

    public Tennis()
    {
        super();

        this.spacing = "\t\t\t";
    }

    // Returns the course's title, then the teacher's last name, followed by the course's building and room number concatenated as a string
    public String toString()
    {
        return this.course + this.spacing + this.teacher + "\t\t" + super.toString() + "\n";
    }
}