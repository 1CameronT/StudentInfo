import java.util.Scanner;

/**
 * 
 *Name:
 *Teacher:
 *Assignment#, Program #
 *Date Last Modified:
 *
 */

/**
 * 
 */

/**
 * @author c.toy
 *
 */
public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		String firstName;
		String lastName;
		int Grade;
		int ID;
		String Login;
		double Average;
		
		
		System.out.println("What's your first name? ");
		firstName = userInput.nextLine();
		
		System.out.println("What's your last name? ");
		lastName = userInput.nextLine();
		
		System.out.println("What grade are you in? ");
		Grade = userInput.nextInt();
		
		System.out.println("What's your student ID? ");
		ID = userInput.nextInt();
		
		System.out.println("What's your login? ");
		Login = userInput.next();
		
		System.out.println("What's your school average? ");
		Average = userInput.nextDouble();
		
		
		System.out.println(String.format("%-20s" + Login, "Login:"));
		System.out.println(String.format("%-20s" + ID, "ID:"));
		System.out.println(String.format("%-20s" + lastName + ", " + firstName, "firstName:"));
		System.out.println(String.format("%-20s" + Average, "Average:"));
		System.out.println(String.format("%-20s" + Grade, "Grade:"));
		
		
		userInput.close();
		
	}

}
