package courseregistrationsystem;

import java.io.IOException;

public abstract class CommonControls
{
    //---------------------------------------------------------------
    // Polymorphic and abstract methods subjective to various classes
    //---------------------------------------------------------------

    /* 
    Different people have slightly different displaying functions
    ex. Admin and student:
        - Admins can oversee and display all student accounts
        - Students can only display their own account and info
    */
    abstract void display();

    /* 
    Different people have slightly different editing functions 
    ex. Admin and student:
        - Admins has to choose which account to edit and when prompted to edit something, the wording is more generic and official
        - Students simply edits personal info, courses, or address, and the wording is more personal and confidential
    */
    abstract void edit();

    /* 
    Different people have slightly different saving functions
    ex. Admin and student:
        - Admins can oversee and save all student accounts
        - Students can only save their own account and info
    */
    abstract void save() throws IOException;
}