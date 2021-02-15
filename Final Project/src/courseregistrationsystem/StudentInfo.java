package courseregistrationsystem;

public class StudentInfo extends Student
{
    //----------------------------------------------------------------
    // Represents an arbitrary student's info with user-specified data
    //----------------------------------------------------------------

    // Personal information below must all be made private - only student should know/access
    private String firstName, lastName, sex, counselor, birthday, password;
    private int id, grade, age;
    private Courses courses;
    private HomeAddress homeAddress;

    public StudentInfo(String lastName, String firstName, String sex, String counselor, String birthday, String password, int id, int grade, int age, Courses courses, HomeAddress homeAddress)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = sex;
        this.counselor = counselor;
        this.birthday = birthday;
        this.password = password;
        this.id = id;
        this.grade = grade;
        this.age = age;
        this.courses = courses;
        this.homeAddress = homeAddress;
    }

    // Returns and organizes an arbitrary student's info as a String
    public String toString()
    {
        String info = "";

        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += "Last Name"   + "\t"   + "First Name"   + "\t"   + "Sex"    + "\t\t" + "Grade"    + "\t\t" + "Birthday"    + "\t\t" + "Age"    + "\t\t" + "Counselor" + "\n";
        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += this.lastName + "\t\t" + this.firstName + "\t\t" + this.sex + "\t\t" + this.grade + "\t\t" + this.birthday + "\t\t" + this.age + "\t\t" + this.counselor + "\n\n";

        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += "Student ID" + "\t"   + "Password"    + "\n";
        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += this.id      + "\t\t" + this.password + "\n\n";

        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += "Residence and Mailing Address" + "\n";
        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += homeAddress                     + "\n\n";

        info += "----------------------------------------------------------------------------------------------------------------------------------\n";
        info += "Courses"    + "\n";
        info += "----------------------------------------------------------------------------------------------------------------------------------" + "\n";
        info += this.courses;

        return info;
    }

    // Method to retrieve student's last name
    public String getLastName()
    {
        return this.lastName;
    }

    // Method to retrieve student's first name
    public String getFirstName()
    {
        return this.firstName;
    }

    // Method to retrieve student's sex
    public String getSex()
    {
        return this.sex;
    }

    // Method to retrieve student's counselor
    public String getCounselor()
    {
        return this.counselor;
    }

    // Method to retrieve student's birthday
    public String getBirthday()
    {
        return this.birthday;
    }

    // Method to retrieve student's password
    public String getPassword()
    {
        return this.password;
    }

    // Method to retrieve student's grade
    public int getGrade()
    {
        return this.grade;
    }

    // Method to retrieve student's age
    public int getAge()
    {
        return this.age;
    }

    // Method to retrieve student's courses
    public Courses getCourses()
    {
        return this.courses;
    }

    // Method to retrieve student's address
    public HomeAddress getHomeAddress()
    {
        return this.homeAddress;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------

    // Method to update student's last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // Method to update student's first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // Method to update student's sex
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    // Method to update student's counselor
    public void setCounselor(String counselor)
    {
        this.counselor = counselor;
    }

    // Method to update student's birthday
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    // Method to update student's password
    public void setPassword(String password)
    {
        this.password = password;
    }

    // Method to update student's grade
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    // Method to update student's age
    public void setAge(int age)
    {
        this.age = age;
    }

    // Method to update student's courses
    public void setCourses(Courses courses)
    {
        this.courses = courses;
    }

    // Method to update student's address
    public void setHomeAddress(HomeAddress homeAddress)
    {
        this.homeAddress = homeAddress;
    }
}