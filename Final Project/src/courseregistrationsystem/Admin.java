package courseregistrationsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Admin extends CommonControls implements AdminControls
{
	//-----------------------------------------
	// Represents an admin with admin abilities
	//-----------------------------------------

	Scanner scan = new Scanner (System.in);

	// Create an ArrayList that holds 6 student accounts
	ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();

	// Method to manually create a bunch of random students to manage when object is instantiated
	@Override
	public void instantiateStudents()
	{
		// Courses
		Biology student1ScienceCourse       = new Biology("Honors");
		Geometry student1MathCourse         = new Geometry("Regular");
		English_1 student1EnglishCourse     = new English_1("Honors");
		World_History student1HistoryCourse = new World_History("Regular");
		Basketball student1Sport            = new Basketball();

		Geology student2ScienceCourse       = new Geology("Honors");
		Precalculus student2MathCourse      = new Precalculus("Regular");
		English_3 student2EnglishCourse     = new English_3("Honors");
		US_History student2HistoryCourse    = new US_History("Honors");

		Chemistry student3ScienceCourse     = new Chemistry("Regular");
		Algebra_2 student3MathCourse        = new Algebra_2("Regular");
		English_2 student3EnglishCourse     = new English_2("Honors");
		Geography student3HistoryCourse     = new Geography("Honors");

		Biology student4ScienceCourse       = new Biology("Honors");
		Geometry student4MathCourse         = new Geometry("Honors");
		English_1 student4EnglishCourse     = new English_1("Honors");
		World_History student4HistoryCourse = new World_History("Honors");

		Geology student5ScienceCourse       = new Geology("Honors");
		Precalculus student5MathCourse      = new Precalculus("Regular");
		English_3 student5EnglishCourse     = new English_3("Regular");
		US_History student5HistoryCourse    = new US_History("Honors");
		Tennis student5Sport                = new Tennis();

		Geology student6ScienceCourse       = new Geology("Honors");
		Precalculus student6MathCourse      = new Precalculus("Honors");
		English_3 student6EnglishCourse     = new English_3("Honors");
		US_History student6HistoryCourse    = new US_History("Honors");
		Football student6Sport              = new Football();

		Courses student1Courses = new Courses (5, student1ScienceCourse, student1MathCourse, student1EnglishCourse, student1HistoryCourse, student1Sport);
		Courses student2Courses = new Courses (4, student2ScienceCourse, student2MathCourse, student2EnglishCourse, student2HistoryCourse);
		Courses student3Courses = new Courses (4, student3ScienceCourse, student3MathCourse, student3EnglishCourse, student3HistoryCourse);
		Courses student4Courses = new Courses (4, student4ScienceCourse, student4MathCourse, student4EnglishCourse, student4HistoryCourse);
		Courses student5Courses = new Courses (5, student5ScienceCourse, student5MathCourse, student5EnglishCourse, student5HistoryCourse, student5Sport);
		Courses student6Courses = new Courses (5, student6ScienceCourse, student6MathCourse, student6EnglishCourse, student6HistoryCourse, student6Sport);

		// -----------------------------------------------------------------------------------------------------------------------------------------------

		// Addresses
		HomeAddress student1Address = new HomeAddress ("2410 Deercove Drive",  "Rolling Hills Estates", "CA", 90274);
		HomeAddress student2Address = new HomeAddress ("9243 Stone Street",    "Rancho Palos Verdes",   "CA", 90275);
		HomeAddress student3Address = new HomeAddress ("4915 Snyder Avenue",   "Rancho Palos Verdes",   "CA", 90275);
		HomeAddress student4Address = new HomeAddress ("6395 Robin Boulevard", "Rolling Hills Estates", "CA", 90274);
		HomeAddress student5Address = new HomeAddress ("3462 Ironhood Dr",     "Rolling Hills Estates", "CA", 90274);
		HomeAddress student6Address = new HomeAddress ("1032 Madison Dr",      "Rancho Palos Verdes",   "CA", 90275);

		// -----------------------------------------------------------------------------------------------------------------------------------------------

		// Students
		StudentInfo student1 = new StudentInfo ("Johnson", "Julia",  "F", "Morris", "05/23/2005", "jj2005", 589304, 9,  15, student1Courses, student1Address);
		StudentInfo student2 = new StudentInfo ("Lee",     "Linda",  "F", "Rogers", "06/13/2004", "lm2004", 572352, 11, 17, student2Courses, student2Address);
		StudentInfo student3 = new StudentInfo ("Lee",     "Daniel", "M", "Reed",   "02/10/2005", "dj2005", 519395, 10, 16, student3Courses, student3Address);
		StudentInfo student4 = new StudentInfo ("Miller",  "Sarah",  "F", "Scott",  "07/14/2005", "sm2005", 502903, 9,  15, student4Courses, student4Address);
		StudentInfo student5 = new StudentInfo ("Davis",   "Josh",   "M", "Cook",   "12/3/2005",  "jd2005", 512305, 11, 17, student5Courses, student5Address);
		StudentInfo student6 = new StudentInfo ("Murphy",  "Lisa",   "F", "Lopez",  "08/31/2004", "lm2004", 562730, 12, 18, student6Courses, student6Address);

		// -----------------------------------------------------------------------------------------------------------------------------------------------

		// Add the students to the ArrayList
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}

	// Method to search for student accounts
	@Override
	public void search()
	{
		// There has to be at least one student in the ArrayList for information to be edited
		if (students.size() != 0)
		{
			System.out.println("\nPlease enter a student's last name to search for:");
			String searchRequest = scan.nextLine();

			StudentInfo student;
			int numberOfMatches = 0;
			String lastName;

			for (int i = 0; i < students.size(); i++)
			{
				// Search is based on student's last name
				student = students.get(i);
				lastName = student.getLastName();

				if (lastName.equalsIgnoreCase(searchRequest))
				{
					// Need to add one to the number since an ArrayList starts at 0, not 1
					int accountNumber = i + 1;
					System.out.println("\nAccount Number: " + (accountNumber));
					System.out.println(student);
					numberOfMatches++;
				}
			}

			if (numberOfMatches == 0)
			{
				System.out.println("\nCould not find any matches.");
			}
			else if (numberOfMatches == 1)
			{
				System.out.println("\nFound " + numberOfMatches + " match.");
			}
			else if (numberOfMatches > 1)
			{
				System.out.println("\nFound " + numberOfMatches + " matches.");
			}
		}
		else
		{
			System.out.println("\nNo accounts available.");
		}
	}

	// Method to add a student account
	@Override
	public void add()
	{
		StudentInfo student;

		System.out.println("\n---------------------------------------");
		System.out.println("Personal Info");
		System.out.println("---------------------------------------\n");

		// Personal info
		// *******************************************************************************************
		// Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
		// *******************************************************************************************
		System.out.println("Enter the id:");
		int id = scan.nextInt();

		System.out.println("Enter the password:");
		scan.nextLine();
		String password = scan.nextLine();

		System.out.println("Enter the first name:");
		String firstName = scan.nextLine();

		System.out.println("Enter the last name:");
		String lastName = scan.nextLine();

		System.out.println("Enter the sex [M/F]:");
		String sex = scan.nextLine();

		System.out.println("Enter the counselor's last name:");
		String counselor = scan.nextLine();

		System.out.println("Enter the date of birth [MM/DD/YYYY]:");
		String birthday = scan.nextLine();

		System.out.println("Enter the grade:");
		int grade = scan.nextInt();

		System.out.println("Enter the age:");
		int age = scan.nextInt();

		// Courses
		Science scienceCourse;
		Math    mathCourse;
		English englishCourse;
		History historyCourse;
		Athletics sport;

		Courses courses;
		HomeAddress address;

		System.out.println("\n---------------------------------------");
		System.out.println("Courses");
		System.out.println("---------------------------------------\n");

		System.out.println("Enter the number of courses [4/5]:");
		int numCourses = scan.nextInt();

		while (numCourses != 5 && numCourses != 4)
		{
			System.out.println("\nInvalid selection. Please try again.");   
			System.out.println("Enter the number of courses [4/5]:");
			numCourses = scan.nextInt();
		}

		// Five courses (with sport)
		if (numCourses == 5)
		{
			// Science
			System.out.println("\nEnter the science course. The options are as follows:");
			System.out.println("--------------");
			System.out.println("Biology   [1]");
			System.out.println("Chemistry [2]");
			System.out.println("Geology   [3]");
			System.out.println("--------------");
			int scienceChoice = scan.nextInt();

			if (scienceChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Biology("Honors");
				}
				else
				{
					scienceCourse = new Biology("Regular");
				}
			}

			else if (scienceChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Chemistry("Honors");
				}
				else
				{
					scienceCourse = new Chemistry("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Geology("Honors");
				}
				else
				{
					scienceCourse = new Geology("Regular");
				}
			}

			// Math
			System.out.println("\nEnter the math course. The options are as follows:");
			System.out.println("----------------");
			System.out.println("Geometry    [1]");
			System.out.println("Algebra 2   [2]");
			System.out.println("Precalculus [3]");
			System.out.println("----------------");
			int mathChoice = scan.nextInt();

			if (mathChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Geometry("Honors");
				}
				else
				{
					mathCourse = new Geometry("Regular");
				}
			}

			else if (mathChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Algebra_2("Honors");
				}
				else
				{
					mathCourse = new Algebra_2("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Precalculus("Honors");
				}
				else
				{
					mathCourse = new Precalculus("Regular");
				}
			}

			// English
			System.out.println("\nEnter the english course . The options are as follows:");
			System.out.println("--------------");
			System.out.println("English 1 [1]");
			System.out.println("English 2 [2]");
			System.out.println("English 3 [3]");
			System.out.println("--------------");
			int englishChoice = scan.nextInt();

			if (englishChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_1("Honors");
				}
				else
				{
					englishCourse = new English_1("Regular");
				}
			}

			else if (englishChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_2("Honors");
				}
				else
				{
					englishCourse = new English_2("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_3("Honors");
				}
				else
				{
					englishCourse = new English_3("Regular");
				}
			}

			// History
			System.out.println("\nEnter the history course. The options are as follows:");
			System.out.println("------------------");
			System.out.println("World History [1]");
			System.out.println("US History    [2]");
			System.out.println("Geography     [3]");
			System.out.println("------------------");
			int historyChoice = scan.nextInt();

			if (historyChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new World_History("Honors");
				}
				else
				{
					historyCourse = new World_History("Regular");
				}
			}

			else if (historyChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new US_History("Honors");
				}
				else
				{
					historyCourse = new US_History("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new Geography("Honors");
				}
				else
				{
					historyCourse = new Geography("Regular");
				}
			}

			// Athletics
			System.out.println("\nEnter the athletics course. The options are as follows:");
			System.out.println("------------------");
			System.out.println("Basketball [1]");
			System.out.println("Tennis     [2]");
			System.out.println("Football   [3]");
			System.out.println("------------------");
			int sportChoice = scan.nextInt();

			if (sportChoice == 1)
			{
				sport = new Basketball();
			}

			else if (sportChoice == 2)
			{
				sport = new Tennis();
			}

			else
			{
				sport = new Football();
			}

			courses = new Courses (numCourses, scienceCourse, mathCourse, englishCourse, historyCourse, sport);
		}

		// Four courses (without sport)
		else
		{
			// Science
			System.out.println("\nEnter the science course. The options are as follows:");
			System.out.println("--------------");
			System.out.println("Biology   [1]");
			System.out.println("Chemistry [2]");
			System.out.println("Geology   [3]");
			System.out.println("--------------");
			int scienceChoice = scan.nextInt();

			if (scienceChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Biology("Honors");
				}
				else
				{
					scienceCourse = new Biology("Regular");
				}
			}

			else if (scienceChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Chemistry("Honors");
				}
				else
				{
					scienceCourse = new Chemistry("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					scienceCourse = new Geology("Honors");
				}
				else
				{
					scienceCourse = new Geology("Regular");
				}
			}

			// Math
			System.out.println("\nEnter the math course. The options are as follows:");
			System.out.println("----------------");
			System.out.println("Geometry    [1]");
			System.out.println("Algebra 2   [2]");
			System.out.println("Precalculus [3]");
			System.out.println("----------------");
			int mathChoice = scan.nextInt();

			if (mathChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Geometry("Honors");
				}
				else
				{
					mathCourse = new Geometry("Regular");
				}
			}

			else if (mathChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Algebra_2("Honors");
				}
				else
				{
					mathCourse = new Algebra_2("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					mathCourse = new Precalculus("Honors");
				}
				else
				{
					mathCourse = new Precalculus("Regular");
				}
			}

			// English
			System.out.println("\nEnter the english course. The options are as follows:");
			System.out.println("--------------");
			System.out.println("English 1 [1]");
			System.out.println("English 2 [2]");
			System.out.println("English 3 [3]");
			System.out.println("--------------");
			int englishChoice = scan.nextInt();

			if (englishChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_1("Honors");
				}
				else
				{
					englishCourse = new English_1("Regular");
				}
			}

			else if (englishChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_2("Honors");
				}
				else
				{
					englishCourse = new English_2("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					englishCourse = new English_3("Honors");
				}
				else
				{
					englishCourse = new English_3("Regular");
				}
			}

			// History
			System.out.println("\nEnter the history course. The options are as follows:");
			System.out.println("------------------");
			System.out.println("World History [1]");
			System.out.println("US History    [2]");
			System.out.println("Geography     [3]");
			System.out.println("------------------");
			int historyChoice = scan.nextInt();

			if (historyChoice == 1)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new World_History("Honors");
				}
				else
				{
					historyCourse = new World_History("Regular");
				}
			}

			else if (historyChoice == 2)
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new US_History("Honors");
				}
				else
				{
					historyCourse = new US_History("Regular");
				}
			}

			else
			{
				System.out.println("Honors or regular class? [H/R]");
				scan.nextLine();
				String honorsOrRegular = scan.nextLine();

				if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
				{
					historyCourse = new Geography("Honors");
				}
				else
				{
					historyCourse = new Geography("Regular");
				}
			}

			courses = new Courses (numCourses, scienceCourse, mathCourse, englishCourse, historyCourse);
		}

		// Address
		System.out.println("\n---------------------------------------");
		System.out.println("Address");
		System.out.println("---------------------------------------\n");

		System.out.println("Enter the street address:");
		// If the user chose to have five periods, need an extra scan.nextLine() because previous choice required an int when picking what sport they would like
		// Unlike the academic courses, there also wasn't an option to select an honors or regular course resulting in the need for another scan.nextLine();
		if (numCourses == 5)
		{
			scan.nextLine();
		}
		String streetAddress = scan.nextLine();

		System.out.println("Enter the city:");
		String city = scan.nextLine();

		System.out.println("Enter the state:");
		String state = scan.nextLine();

		System.out.println("Enter the zip code:");
		int zipCode = scan.nextInt();

		address = new HomeAddress (streetAddress, city, state, zipCode);

		// Combine all aspects of the student account into a single student
		student = new StudentInfo (lastName, firstName, sex, counselor, birthday, password, id, grade, age, courses, address);

		// Final question prompting the user if they truly want to delete the account
		System.out.println("\nAre you sure you want to add this account? [Y/N]");
		scan.nextLine();
		String finalDecision = scan.nextLine();

		if (finalDecision.equalsIgnoreCase("Y"))
		{
			students.add(student);
			// Confirm addition of new account
			System.out.println("\nAccount added.");
		}   
		else
		{
			System.out.println("\nAccount was not added.");
		}
	}

	// Method to remove a student account
	@Override
	public void remove()
	{
		// If the admin added more accounts and there are now more than 6
		if (students.size() >= 7)
		{
			System.out.println("\nWhich account would you like to delete? [1 - " + students.size() + "]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > students.size() || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1 - " + students.size() + "]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 6)
		{
			System.out.println("\nWhich account would you like to delete? [1, 2, 3, 4, 5, 6]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 6 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1, 2, 3, 4, 5, 6]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 5)
		{
			System.out.println("\nWhich account would you like to delete? [1, 2, 3, 4, 5]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 5 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1, 2, 3, 4, 5]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 4)
		{
			System.out.println("\nWhich account would you like to delete? [1, 2, 3, 4]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 4 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1, 2, 3, 4]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 3)
		{
			System.out.println("\nWhich account would you like to delete? [1, 2, 3]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 3 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1, 2, 3]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 2)
		{
			System.out.println("\nWhich account would you like to delete? [1, 2]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 2 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1, 2]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else if (students.size() == 1)
		{
			System.out.println("\nWhich account would you like to delete? [1]");
			int accountToDelete = scan.nextInt();

			while (accountToDelete > 1 || accountToDelete < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account would you like to delete? [1]");
				accountToDelete = scan.nextInt();
			}

			// Final question prompting the user if they truly want to delete the account
			System.out.println("Are you sure you want to permanently delete account " + accountToDelete + "? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				// Need to subtract one from the number since an ArrayList starts at 0, not 1
				accountToDelete -= 1;
				students.remove(accountToDelete);

				// Confirm deletion and add one to the account number when displaying it to the user since they ArrayLists begin at index 0
				System.out.println("\nAccount " + (accountToDelete + 1) + " deleted.");
			}   
			else
			{
				System.out.println("\nAccount was not deleted.");
			}
		}

		else
		{
			System.out.println("\nNo accounts available.");
		}
	}

	// Method to display students' accounts
	public void display()
	{
		// There has to be at least one student in the ArrayList for information to be edited
		if (students.size() != 0)
		{
			int accountNumber = 0;
			for (StudentInfo account : students)
			{
				accountNumber++;
				System.out.println("\nAccount Number: " + (accountNumber));
				System.out.println(account);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

		else
		{
			System.out.println("\nNo accounts available.");
		}
	}

	// Method to edit a student's account
	public void edit()
	{
		// There has to be at least one account in the ArrayList for information to be edited
		if (students.size() != 0)
		{
			System.out.println("\nWhich account's information would you like to edit? [1 - " + students.size() + "]");
			int accountToEdit = scan.nextInt();

			while (accountToEdit > students.size() || accountToEdit < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("Which account's information would you like to edit? [1 - " + students.size() + "]");
				accountToEdit = scan.nextInt();
			}

			// Need to subtract one from the number since an ArrayList starts at 0, not 1
			accountToEdit -= 1;
			StudentInfo student = students.get(accountToEdit);

			// Student id's cannot be changed, so that is not an option
			System.out.println("\nYou may edit:");
			System.out.println("-----------------");
			System.out.println("Last Name    [1]"); 
			System.out.println("First Name   [2]");
			System.out.println("Sex          [3]");
			System.out.println("Grade        [4]");
			System.out.println("Birthday     [5]");
			System.out.println("Age          [6]");
			System.out.println("Counselor    [7]");
			System.out.println("Password     [8]");
			System.out.println("Home Address [9]");
			System.out.println("Courses      [10]");
			System.out.println("-----------------");
			int infoToEdit = scan.nextInt();

			while (infoToEdit > 10 || infoToEdit < 1)
			{
				AdminMenu.invalidSelection();   
				System.out.println("\nYou may edit:");
				System.out.println("-----------------");
				System.out.println("Last Name    [1]"); 
				System.out.println("First Name   [2]");
				System.out.println("Sex          [3]");
				System.out.println("Grade        [4]");
				System.out.println("Birthday     [5]");
				System.out.println("Age          [6]");
				System.out.println("Counselor    [7]");
				System.out.println("Password     [8]");
				System.out.println("Home Address [9]");
				System.out.println("Courses      [10]");
				System.out.println("-----------------");
				infoToEdit = scan.nextInt();
			}

			// *******************************************************************************************
			// Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
			// *******************************************************************************************

			if (infoToEdit == 1)
			{
				System.out.println("\nThe last name right now is " + student.getLastName());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setLastName(updatedInfo);
					System.out.println("The last name is now " + student.getLastName());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}
			else if (infoToEdit == 2)
			{
				System.out.println("\nThe first name right now is " + student.getFirstName());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setFirstName(updatedInfo);
					System.out.println("The first name is now " + student.getFirstName());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 3)
			{
				System.out.println("\nThe sex right now is " + student.getSex());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setSex(updatedInfo);
					System.out.println("The sex is now " + student.getSex());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 4)
			{
				System.out.println("\nThe grade right now is " + student.getGrade());

				System.out.println("What would you like to change it to?");
				int updatedInfo = scan.nextInt();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				scan.nextLine();
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setGrade(updatedInfo);
					System.out.println("The grade is now " + student.getGrade());
				}   
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 5)
			{
				System.out.println("\nThe birthday right now is " + student.getBirthday());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setBirthday(updatedInfo);
					System.out.println("The birthday is now " + student.getBirthday());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 6)
			{
				System.out.println("\nThe age right now is " + student.getAge());

				System.out.println("What would you like to change it to?");
				int updatedInfo = scan.nextInt();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				scan.nextLine();
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setAge(updatedInfo);
					System.out.println("The age is now " + student.getAge());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 7)
			{
				System.out.println("\nThe counselor right now is " + student.getCounselor());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setCounselor(updatedInfo);
					System.out.println("The counselor is now " + student.getCounselor());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 8)
			{
				System.out.println("\nThe password right now is " + student.getPassword());

				System.out.println("What would you like to change it to?");
				scan.nextLine();
				String updatedInfo = scan.nextLine();

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setPassword(updatedInfo);
					System.out.println("The password is now " + student.getPassword());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 9)
			{
				System.out.println("\nThe home address right now is " + student.getHomeAddress());

				// Address
				System.out.println("\nWhat would you like to change the street address to?");
				scan.nextLine();
				String streetAddress = scan.nextLine();
				//streetAddress = Integer.parseInt(streetAddress);

				System.out.println("What would you like to change the city to?");
				String city = scan.nextLine();

				System.out.println("What would you like to change the state to?");
				String state = scan.nextLine();

				System.out.println("What would you like to change the zip code to?");
				int zipCode = scan.nextInt();

				System.out.println();

				HomeAddress updatedAddress = new HomeAddress (streetAddress, city, state, zipCode);

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				scan.nextLine();
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setHomeAddress(updatedAddress);
					System.out.println("The home address is now " + student.getHomeAddress());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}

			else if (infoToEdit == 10)
			{
				Courses updatedCourses;

				Science scienceCourse;
				Math    mathCourse;
				English englishCourse;
				History historyCourse;
				Athletics sport;

				System.out.println("\nYour courses right now are:\n\n" + student.getCourses());

				System.out.println("\nWhat would you like to change the number of courses to? [4/5]");
				int numUpdatedCourses = scan.nextInt();

				// Five courses (with sport)
				if (numUpdatedCourses == 5)
				{
					// Science
					System.out.println("\nWhat would you like to change the science course to? The options are as follows:");
					System.out.println("--------------");
					System.out.println("Biology   [1]");
					System.out.println("Chemistry [2]");
					System.out.println("Geology   [3]");
					System.out.println("--------------");
					int scienceChoice = scan.nextInt();

					if (scienceChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Biology("Honors");
						}
						else
						{
							scienceCourse = new Biology("Regular");
						}
					}

					else if (scienceChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Chemistry("Honors");
						}
						else
						{
							scienceCourse = new Chemistry("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Geology("Honors");
						}
						else
						{
							scienceCourse = new Geology("Regular");
						}
					}

					// Math
					System.out.println("\nWhat would you like to change the math course to? The options are as follows:");
					System.out.println("----------------");
					System.out.println("Geometry    [1]");
					System.out.println("Algebra 2   [2]");
					System.out.println("Precalculus [3]");
					System.out.println("----------------");
					int mathChoice = scan.nextInt();

					if (mathChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Geometry("Honors");
						}
						else
						{
							mathCourse = new Geometry("Regular");
						}
					}

					else if (mathChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Algebra_2("Honors");
						}
						else
						{
							mathCourse = new Algebra_2("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Precalculus("Honors");
						}
						else
						{
							mathCourse = new Precalculus("Regular");
						}
					}

					// English
					System.out.println("\nWhat would you like to change the english course to? The options are as follows:");
					System.out.println("--------------");
					System.out.println("English 1 [1]");
					System.out.println("English 2 [2]");
					System.out.println("English 3 [3]");
					System.out.println("--------------");
					int englishChoice = scan.nextInt();

					if (englishChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_1("Honors");
						}
						else
						{
							englishCourse = new English_1("Regular");
						}
					}

					else if (englishChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_2("Honors");
						}
						else
						{
							englishCourse = new English_2("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_3("Honors");
						}
						else
						{
							englishCourse = new English_3("Regular");
						}
					}

					// History
					System.out.println("\nWhat would you like to change the history course to? The options are as follows:");
					System.out.println("------------------");
					System.out.println("World History [1]");
					System.out.println("US History    [2]");
					System.out.println("Geography     [3]");
					System.out.println("------------------");
					int historyChoice = scan.nextInt();

					if (historyChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new World_History("Honors");
						}
						else
						{
							historyCourse = new World_History("Regular");
						}
					}

					else if (historyChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new US_History("Honors");
						}
						else
						{
							historyCourse = new US_History("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new Geography("Honors");
						}
						else
						{
							historyCourse = new Geography("Regular");
						}
					}

					// Athletics
					System.out.println("\nWhat would you like to change the athletics course to? The options are as follows:");
					System.out.println("------------------");
					System.out.println("Basketball [1]");
					System.out.println("Tennis     [2]");
					System.out.println("Football   [3]");
					System.out.println("------------------");
					int sportChoice = scan.nextInt();

					if (sportChoice == 1)
					{
						sport = new Basketball();
					}

					else if (sportChoice == 2)
					{
						sport = new Tennis();
					}

					else
					{
						sport = new Football();
					}

					updatedCourses = new Courses (numUpdatedCourses, scienceCourse, mathCourse, englishCourse, historyCourse, sport);
				}

				// Four courses (without sport)
				else
				{
					// Science
					System.out.println("\nWhat would you like to change the science course to? The options are as follows:");
					System.out.println("--------------");
					System.out.println("Biology   [1]");
					System.out.println("Chemistry [2]");
					System.out.println("Geology   [3]");
					System.out.println("--------------");
					int scienceChoice = scan.nextInt();

					if (scienceChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Biology("Honors");
						}
						else
						{
							scienceCourse = new Biology("Regular");
						}
					}

					else if (scienceChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Chemistry("Honors");
						}
						else
						{
							scienceCourse = new Chemistry("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							scienceCourse = new Geology("Honors");
						}
						else
						{
							scienceCourse = new Geology("Regular");
						}
					}

					// Math
					System.out.println("\nWhat would you like to change the math course to? The options are as follows:");
					System.out.println("----------------");
					System.out.println("Geometry    [1]");
					System.out.println("Algebra 2   [2]");
					System.out.println("Precalculus [3]");
					System.out.println("----------------");
					int mathChoice = scan.nextInt();

					if (mathChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Geometry("Honors");
						}
						else
						{
							mathCourse = new Geometry("Regular");
						}
					}

					else if (mathChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Algebra_2("Honors");
						}
						else
						{
							mathCourse = new Algebra_2("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							mathCourse = new Precalculus("Honors");
						}
						else
						{
							mathCourse = new Precalculus("Regular");
						}
					}

					// English
					System.out.println("\nWhat would you like to change the english course to? The options are as follows:");
					System.out.println("--------------");
					System.out.println("English 1 [1]");
					System.out.println("English 2 [2]");
					System.out.println("English 3 [3]");
					System.out.println("--------------");
					int englishChoice = scan.nextInt();

					if (englishChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_1("Honors");
						}
						else
						{
							englishCourse = new English_1("Regular");
						}
					}

					else if (englishChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_2("Honors");
						}
						else
						{
							englishCourse = new English_2("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							englishCourse = new English_3("Honors");
						}
						else
						{
							englishCourse = new English_3("Regular");
						}
					}

					// History
					System.out.println("\nWhat would you like to change the history course to? The options are as follows:");
					System.out.println("------------------");
					System.out.println("World History [1]");
					System.out.println("US History    [2]");
					System.out.println("Geography     [3]");
					System.out.println("------------------");
					int historyChoice = scan.nextInt();

					if (historyChoice == 1)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new World_History("Honors");
						}
						else
						{
							historyCourse = new World_History("Regular");
						}
					}

					else if (historyChoice == 2)
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new US_History("Honors");
						}
						else
						{
							historyCourse = new US_History("Regular");
						}
					}

					else
					{
						System.out.println("Honors or regular class? [H/R]");
						scan.nextLine();
						String honorsOrRegular = scan.nextLine();

						if (honorsOrRegular.equalsIgnoreCase("H") || honorsOrRegular.equalsIgnoreCase("Honors"))
						{
							historyCourse = new Geography("Honors");
						}
						else
						{
							historyCourse = new Geography("Regular");
						}
					}

					updatedCourses = new Courses (numUpdatedCourses, scienceCourse, mathCourse, englishCourse, historyCourse);
				}

				// Final question prompting the user if they want to make the change
				System.out.println("Are you sure you want to make this change? [Y/N]");
				// If the user chose to have five updated periods, need an extra scan.nextLine() because previous choice required an int when picking what sport they would like
				// Unlike the academic courses, there also wasn't an option to select an honors or regular course resulting in the need for another scan.nextLine();
				if (numUpdatedCourses == 5)
				{
					scan.nextLine();
				}
				String finalDecision = scan.nextLine();

				if (finalDecision.equalsIgnoreCase("Y"))
				{
					student.setCourses(updatedCourses);
					System.out.println("Your courses are now:\n\n" + student.getCourses());
				}
				else
				{
					System.out.println("No edits made.");
				}
			}
		}

		else
		{
			System.out.println("\nNo accounts available.");
		}
	}

	// Method to save students' account information to user's desktop
	public void save() throws IOException
	{
		// Instantiate a string builder, which is like a String object, but can be modified/mutated
		StringBuilder sb = new StringBuilder();

		// File path that the user will provide
		String filePath;

		// There has to be at least one student in the ArrayList for information to be saved
		if (students.size() != 0)
		{
			for (int i = 0; i < students.size(); i++)
			{
				// Need to add one to the number since an ArrayList starts at 0, not 1
				int accountNumber = i + 1;
				// Adds the account number to the StringBuilder
				sb.append("\nAccount Number: " + (accountNumber) + "\n");
				// Adds the student's information to the StringBuilder
				sb.append(students.get(i));
				// Adds a line for distinction, visual appeal, and organization between accounts to the StringBuilder
				sb.append("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			}
		}

		else
		{
			System.out.println("\nNo accounts available.");
		}

		// *******************************************************************************************
		// Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
		// *******************************************************************************************

		System.out.println("\nEnter a file path in which you would like to store your information:");
		filePath = scan.nextLine();

		/* If my project/program is opened from a flashdrive, the file path provided is nothing/null, and the user just hits enter, 
        the file/info will still be saved to the flashdrive. This only applies if the project/program is opened from a flashdrive, however.
        If the project/program is opened from another location like a personal folder on a user's computer and not a flashdrive,
        the file/info will fail to save. I don't know why this is so, as it just seems to occur for flashdrives. */

		for (int i = 0; i < filePath.length(); i++)
		{
			// Need to add an extra "\" for each "\" in the provided file path, since the "\" requires an escape sequence in Java
			char letter = filePath.charAt(i);
			if (letter == '\\')
			{
				filePath = filePath.replace("\\", "\\\\");
				break;
			}
		}

		// Add this to the end of the file path to give the file a name
		filePath += "\\Students Information.txt";

		// Print/export data and write to the provided file path after fully updated
		try 
		(
				// FileWriter is utilized to write character-oriented streams of data to a file.
				FileWriter fw = new FileWriter(filePath);
				/* BufferedWriter writes text to character output stream, buffering characters 
        so as to provide for the efficient writing of single characters, arrays, and strings. */
				BufferedWriter bw = new BufferedWriter(fw);
				// PrintWriter enables formatted data, characters, and representations of objects to be printed/written to a text-output stream.
				PrintWriter pw = new PrintWriter(bw)
				)
		{
			// Converts the data to more readable Strings or letters
			pw.print(sb.toString());

			// If the file path saving does indeed succeed, display a valid message
			System.out.println("\nSaved.");
		}
		catch (IOException e) 
		{
			// In the case that the file path was invalid or there was an error with saving the information, display an invalid message
			System.out.println("\nFailed to save due to invalid file path.");
		}
	}
}