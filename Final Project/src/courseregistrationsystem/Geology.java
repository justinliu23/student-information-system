package courseregistrationsystem;

public class Geology extends Science
{
    //---------------------------------------
    // Represents the Science course, Geology
    //---------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "Geology";
    public String teacher = "Wilson";
    public String roomNumber = "12";
    public String honorsOrRegular;

    // Space to help line up and organize courses  
    String spacing;

    public Geology (String honorsOrRegular)
    {
        super();

        // If the user wants to take honors, add an "H" at the end of the course title
        if (honorsOrRegular.equalsIgnoreCase("Honors"))
        {
            this.honorsOrRegular = " H";
            // If the user chooses honors, decrease the spacing to counteract the extra spacing and misalignment
            this.spacing = "\t\t";
        }

        // Else leave the the course title alone
        else
        {
            this.honorsOrRegular = "";
            // If the user chooses regular, increase the spacing to compensate for the lessened spacing and misalignment
            this.spacing = "\t\t\t";
        }
    }

    // Returns the course's title, then the teacher's last name, followed by the course's building and room number concatenated as a string
    public String toString()
    {
        return this.course + this.honorsOrRegular + this.spacing + this.teacher + "\t\t" + super.toString() + this.roomNumber + "\n";
    }
}