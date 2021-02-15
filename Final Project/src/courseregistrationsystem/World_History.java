package courseregistrationsystem;

public class World_History extends History
{
    //---------------------------------------------
    // Represents the History course, World History
    //---------------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "World History";
    public String teacher = "Roberts";
    public String roomNumber = "21";
    public String honorsOrRegular;

    // Space to help line up and organize courses  
    String spacing;

    public World_History (String honorsOrRegular)
    {
        super();

        // If the user wants to take honors, add an "H" at the end of the course title
        if (honorsOrRegular.equalsIgnoreCase("Honors"))
        {
            this.honorsOrRegular = " H";

            // Spacing will always be "\t\t" since "world history" contains enough letters to account for space
            this.spacing = "\t\t";
        }

        // Else leave the the course title alone
        else
        {
            this.honorsOrRegular = "";

            // Spacing will always be "\t\t" since "world history" contains enough letters to account for space
            this.spacing = "\t\t";
        }
    }

    // Returns the course's title, then the teacher's last name, followed by the course's building and room number concatenated as a string
    public String toString()
    {
        return this.course + this.honorsOrRegular + this.spacing + this.teacher + "\t\t" + super.toString() + this.roomNumber + "\n";
    }
}