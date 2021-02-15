package courseregistrationsystem;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Student extends CommonControls implements StudentControls
{
	//--------------------------------------------------------------------
	// Represents a student with user-specified data and student abilities
	//--------------------------------------------------------------------

	Scanner scan = new Scanner (System.in);
	// Student's information must be made private - only student should know/access
	private StudentInfo student;

	// Method to take in user input for registering a new student account
	@Override
	public void register()
	{
		System.out.println("\n---------------------------------------");
		System.out.println("Personal Info");
		System.out.println("---------------------------------------\n");

		// Personal info
		System.out.println("Enter your first name:");
		String firstName = scan.nextLine();

		System.out.println("Enter your last name:");
		String lastName = scan.nextLine();

		System.out.println("Enter your sex [M/F]:");
		String sex = scan.nextLine();

		System.out.println("Enter your counselor's last name:");
		String counselor = scan.nextLine();

		System.out.println("Enter your date of birth [MM/DD/YYYY]:");
		String birthday = scan.nextLine();

		System.out.println("Enter your grade:");
		int grade = scan.nextInt();

		System.out.println("Enter your age:");
		int age = scan.nextInt();

		// Courses
		// *******************************************************************************************
		// Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
		// *******************************************************************************************

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

		System.out.println("Enter the number of courses you would like to take [4/5]:");
		int numCourses = scan.nextInt();

		while (numCourses != 5 && numCourses != 4)
		{
			System.out.println("\nInvalid selection. Please try again.");   
			System.out.println("Enter the number of courses you would like to take [4/5]:");
			numCourses = scan.nextInt();
		}

		// Five courses (with sport)
		if (numCourses == 5)
		{
			// Science
			System.out.println("\nEnter the science course you would like to take. The options are as follows:");
			System.out.println("--------------");
			System.out.println("Biology   [1]");
			System.out.println("Chemistry [2]");
			System.out.println("Geology   [3]");
			System.out.println("--------------");
			int scienceChoice = scan.nextInt();

			if (scienceChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the math course you would like to take. The options are as follows:");
			System.out.println("----------------");
			System.out.println("Geometry    [1]");
			System.out.println("Algebra 2   [2]");
			System.out.println("Precalculus [3]");
			System.out.println("----------------");
			int mathChoice = scan.nextInt();

			if (mathChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the english course you would like to take. The options are as follows:");
			System.out.println("--------------");
			System.out.println("English 1 [1]");
			System.out.println("English 2 [2]");
			System.out.println("English 3 [3]");
			System.out.println("--------------");
			int englishChoice = scan.nextInt();

			if (englishChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the history course you would like to take. The options are as follows:");
			System.out.println("------------------");
			System.out.println("World History [1]");
			System.out.println("US History    [2]");
			System.out.println("Geography     [3]");
			System.out.println("------------------");
			int historyChoice = scan.nextInt();

			if (historyChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the athletics course you would like to take. The options are as follows:");
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
			System.out.println("\nEnter the science course you would like to take. The options are as follows:");
			System.out.println("--------------");
			System.out.println("Biology   [1]");
			System.out.println("Chemistry [2]");
			System.out.println("Geology   [3]");
			System.out.println("--------------");
			int scienceChoice = scan.nextInt();

			if (scienceChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the math course you would like to take. The options are as follows:");
			System.out.println("----------------");
			System.out.println("Geometry    [1]");
			System.out.println("Algebra 2   [2]");
			System.out.println("Precalculus [3]");
			System.out.println("----------------");
			int mathChoice = scan.nextInt();

			if (mathChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the english course you would like to take. The options are as follows:");
			System.out.println("--------------");
			System.out.println("English 1 [1]");
			System.out.println("English 2 [2]");
			System.out.println("English 3 [3]");
			System.out.println("--------------");
			int englishChoice = scan.nextInt();

			if (englishChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			System.out.println("\nEnter the history course you would like to take. The options are as follows:");
			System.out.println("------------------");
			System.out.println("World History [1]");
			System.out.println("US History    [2]");
			System.out.println("Geography     [3]");
			System.out.println("------------------");
			int historyChoice = scan.nextInt();

			if (historyChoice == 1)
			{
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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
				System.out.println("Would you like to take the honors or regular class? [H/R]");
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

		System.out.println("Enter your street address:");
		// If the user chose to have five courses, need an extra scan.nextLine() because previous choice required an int when picking what sport they would like
		// Unlike the academic courses, there also wasn't an option to select an honors or regular course resulting in the need for another scan.nextLine();
		if (numCourses == 5)
		{
			scan.nextLine();
		}
		String streetAddress = scan.nextLine();

		System.out.println("Enter your city:");
		String city = scan.nextLine();

		System.out.println("Enter your state:");
		String state = scan.nextLine();

		System.out.println("Enter your zip code:");
		int zipCode = scan.nextInt();

		address = new HomeAddress (streetAddress, city, state, zipCode);

		// Retrieve the student's id and password from the menu when they logged in
		int id = Menu.getID();
		String password = Menu.getPassword();

		// Combine all aspects of the student account into a single student
		student = new StudentInfo (lastName, firstName, sex, counselor, birthday, password, id, grade, age, courses, address);
	}

	// Method to display a student's account
	public void display()
	{
		System.out.println();
		System.out.println(student);
	}

	// Method to edit a student's account
	public void edit()
	{
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
			System.out.println("\nInvalid selection. Please try again.");   
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
			System.out.println("\nYour last name right now is " + student.getLastName());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setLastName(updatedInfo);
				System.out.println("Your last name is now " + student.getLastName());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}
		else if (infoToEdit == 2)
		{
			System.out.println("\nYour first name right now is " + student.getFirstName());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setFirstName(updatedInfo);
				System.out.println("Your first name is now " + student.getFirstName());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 3)
		{
			System.out.println("\nYour sex right now is " + student.getSex());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setSex(updatedInfo);
				System.out.println("Your sex is now " + student.getSex());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 4)
		{
			System.out.println("\nYour grade right now is " + student.getGrade());

			System.out.println("What would you like to change it to?");
			int updatedInfo = scan.nextInt();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setGrade(updatedInfo);
				System.out.println("Your grade is now " + student.getGrade());
			}   
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 5)
		{
			System.out.println("\nYour birthday right now is " + student.getBirthday());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setBirthday(updatedInfo);
				System.out.println("Your birthday is now " + student.getBirthday());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 6)
		{
			System.out.println("\nYour age right now is " + student.getAge());

			System.out.println("What would you like to change it to?");
			int updatedInfo = scan.nextInt();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			scan.nextLine();
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setAge(updatedInfo);
				System.out.println("Your age is now " + student.getAge());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 7)
		{
			System.out.println("\nYour counselor right now is " + student.getCounselor());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setCounselor(updatedInfo);
				System.out.println("Your counselor is now " + student.getCounselor());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 8)
		{
			System.out.println("\nYour password right now is " + student.getPassword());

			System.out.println("What would you like to change it to?");
			scan.nextLine();
			String updatedInfo = scan.nextLine();

			// Final question prompting the user if they want to make the change
			System.out.println("Are you sure you want to make this change? [Y/N]");
			String finalDecision = scan.nextLine();

			if (finalDecision.equalsIgnoreCase("Y"))
			{
				student.setPassword(updatedInfo);
				System.out.println("Your password is now " + student.getPassword());
			}
			else
			{
				System.out.println("No edits made.");
			}
		}

		else if (infoToEdit == 9)
		{
			System.out.println("\nYour home address right now is " + student.getHomeAddress());

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
				System.out.println("Your home address is now " + student.getHomeAddress());
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
					System.out.println("Would you like to take the honors or regular class? [H/R]");
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
			// If the user chose to have five updated courses, need an extra scan.nextLine() because previous choice required an int when picking what sport they would like
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

	// Method to save a student's account information to user's desktop
	public void save() throws IOException
	{
		// Instantiate a string builder, which is like a String object, but can be modified/mutated
		StringBuilder sb = new StringBuilder();

		// File path that the user will provide
		String filePath;

		// Adds the student's information to the StringBuilder
		sb.append(student + "\n");

		// *******************************************************************************************
		// Some lines require an extra scan.nextLine() or parseInt() when switching from int to String
		// *******************************************************************************************

		System.out.println("\nEnter a file path in which you would like to store your information:");
		// This next block of code counteracts a bug of having an extra or missing scan.nextLine() after student edits or saves their information
		// Very hard to explain, as the scanner bugs out and has trouble when constantly taking in integers followed by strings
		if (!Menu.getEditedOrSaved())
		{
			scan.nextLine();
		}
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
		filePath += "\\Student Information.txt";

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