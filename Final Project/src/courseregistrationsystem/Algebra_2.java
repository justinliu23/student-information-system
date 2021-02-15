package courseregistrationsystem;

public class Algebra_2 extends Math
{
    //--------------------------------------
    // Represents the Math course, Algebra 2
    //--------------------------------------

    // Course specifications should be known/accessible to everyone
    public String course = "Algebra 2";
    public String teacher = "Kurt";
    public String roomNumber = "46";
    public String honorsOrRegular;

    // Space to help line up and organize courses  
    String spacing;

    public Algebra_2 (String honorsOrRegular)
    {
        super();

        // If the user wants to take honors, add an "H" at the end of the course title
        if (honorsOrRegular.equalsIgnoreCase("Honors"))
        {
            this.honorsOrRegular = " H";

            // Spacing will always be "\t\t" since algebra 2 contains enough letters to account for space
            this.spacing = "\t\t";
        }

        // Else leave the the course title alone
        else
        {
            this.honorsOrRegular = "";

            // Spacing will always be "\t\t" since algebra 2 contains enough letters to account for space
            this.spacing = "\t\t";
        }
    }

    // Return the course's title, then the teacher's last name, followed by the course's building and room number concatenated.
    public String toString()
    {
        return this.course + this.honorsOrRegular + this.spacing + this.teacher + "\t\t" + super.toString() + this.roomNumber + "\n";
    }
}