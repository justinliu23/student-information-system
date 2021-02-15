package courseregistrationsystem;

public class Courses
{
    //-----------------------------------------------------------------------------------
    // Represents the Courses and how they are arranged/oriented with user-specified data
    //-----------------------------------------------------------------------------------

    // Course information below must all be made private - only student should know/access
    private int numberOfCourses;
    private Science scienceCourse;
    private Math mathCourse;
    private English englishCourse;
    private History historyCourse;
    private Athletics sport;

    // Method overloading - if a student has four courses, assign 4 periods
    public Courses (int numberOfCourses, Science scienceCourse, Math mathCourse, English englishCourse, History historyCourse)
    {
        this.numberOfCourses = numberOfCourses;
        this.scienceCourse = scienceCourse;
        this.mathCourse = mathCourse;
        this.englishCourse = englishCourse;
        this.historyCourse = historyCourse;
    }

    // Method overloading - if a student has five courses, assign 5 periods
    public Courses (int numberOfCourses, Science scienceCourse, Math mathCourse, English englishCourse, History historyCourse, Athletics sport)
    {
        this.numberOfCourses = numberOfCourses;
        this.scienceCourse = scienceCourse;
        this.mathCourse = mathCourse;
        this.englishCourse = englishCourse;
        this.historyCourse = historyCourse;
        this.sport = sport;
    }

    // Returns and organizes an arbitrary student's courses as a String
    public String toString()
    {
        String courses = "";

        courses += "Period" + "\t\t" + "Course" +  "\t\t\t" + "Teacher" + "\t\t" + "Room" + "\n";

        if (this.numberOfCourses == 4)
        {
            courses += "************************************************************\n";
            courses += "1" + "\t\t" + this.scienceCourse;
            courses += "2" + "\t\t" + this.mathCourse;
            courses += "3" + "\t\t" + this.englishCourse;
            courses += "4" + "\t\t" + this.historyCourse;
            courses += "************************************************************";
        }

        else if (this.numberOfCourses == 5)
        {
            courses += "************************************************************\n";
            courses += "1" + "\t\t" + this.scienceCourse;
            courses += "2" + "\t\t" + this.mathCourse;
            courses += "3" + "\t\t" + this.englishCourse;
            courses += "4" + "\t\t" + this.historyCourse;
            courses += "5" + "\t\t" + this.sport;
            courses += "************************************************************";
        }  

        return courses;
    }
}