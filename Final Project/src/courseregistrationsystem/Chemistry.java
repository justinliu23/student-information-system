package courseregistrationsystem;

public class Chemistry extends Science
{
    //-----------------------------------------
    // Represents the Science course, Chemistry
    //-----------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "Chemistry";
    public String teacher = "Lee";
    public String roomNumber = "19";
    public String honorsOrRegular;

    // Space to help line up and organize courses  
    String spacing;

    public Chemistry (String honorsOrRegular)
    {
        super();

        // If the user wants to take honors, add an "H" at the end of the course title
        if (honorsOrRegular.equalsIgnoreCase("Honors"))
        {
            this.honorsOrRegular = " H";

            // Spacing will always be "\t\t" since chemistry contains enough letters to account for space
            this.spacing = "\t\t";
        }

        // Else leave the the course title alone
        else
        {
            this.honorsOrRegular = "";

            // Spacing will always be "\t\t" since chemistry contains enough letters to account for space
            this.spacing = "\t\t";
        }
    }

    // Returns the course's title, then the teacher's last name, followed by the course's building and room number concatenated as a string
    public String toString()
    {
        return this.course + this.honorsOrRegular + this.spacing + this.teacher + "\t\t" + super.toString() + this.roomNumber + "\n";
    }
}