import java.util.Arrays;
import java.util.Scanner;

public class JavaClassIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = { "Michael Chan", "Yasmin Rodriguez", "Pratima Kaza", "Samuel Bernardy", "Marcus Perez",
				"Tim Johnson", "Jenna Price", "Siddique Khatri", "Joe Garza", "Alex Cyr", "Matthew Davis",
				"Serhiy Bardysh" };
		String[] homeTown = { " Rochester, MI", "Ann Arbor, MI", "Edingburg, TX", "Livonia, Mi", "Adrian, MI",
				"Los Angeles, CA", "Lander, WY", "Troy, MI", "Inkster, MI", "Farmington, MI", "Saint Clair Shores, Mi",
				"Nashville, TN" };
		String[] nickName = { " Pooky", "Yazzy", "P-nasty", "S-Dog", "Moose", "T-Dog", "Juice", "Siddid", "Big Joe",
				"Alpha", "Mazzy", "N/A" };
		String[] favFood = { "Sushi", "Indian", "Indian", "Human Flesh", "Fruit", "Ethnic", "Thai", "Indian", "Mexican",
				"Cheeseburgers", "Hibachi", "Ukrainian" };
		String[] categories = { "1: Hometown", "2: Nickname", "3: Favorite food", "4: Return to id numbers" };
		System.out.println(
				"Welcome to our Java class.args Which student would you like to learn more about?");
		char idLoop = 'y';
		
		while (idLoop == 'y' || idLoop == 'Y') {
			System.out.println(("(enter a number 0 - " + (names.length-1) + ")"));
			int studentId = getInt(scan, 0, names.length - 1);
			System.out.println("student with id number " + 	studentId + " is " + names[studentId]);
			System.out.println("Select a categorie to learn more about " + names[studentId] + " or go back.");
			for (String catPrint : categories) {
						System.out.println(catPrint);
												}
		int userNum = getInt(scan, 1, 4);//figure out how to loop through a switch case with more #prompts
			switch (userNum) {
			case 1: System.out.println(homeTown[studentId]);
				break;
			case 2: System.out.println(nickName[studentId]);
				break;
			case 3: System.out.println(favFood[studentId]);
				break;
			default: ;
			}
			System.out.println("Would you like to know more about the students?(Y/N)");
			while (!scan.hasNext("[yYnN]")) {
				System.out.println("Enter y to learn more or n to quit");
				scan.next();
			}
			idLoop = scan.next().charAt(0);
			
		}
		System.out.println("Goodbye!");
	}

	/*
	 * private static int studentID(int idNum) { int diceAmount; Scanner scan = new
	 * Scanner(System.in); do { System.out.println(idNum); while
	 * (!scan.hasNextInt()) { System.out.println("please enter a num between 1");
	 * scan.next(); } diceAmount = scan.nextInt(); } while (diceAmount <= 0); return
	 * diceAmount; }
	 */

	public static int getInt(Scanner sc, int min, int max) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = scan.nextInt();
			if (i < min)
				System.out.println("Error! Number must be between " + min + " and " + max);
			else if (i > max)
				System.out.println("Error! Number must be between " + min + " and " + max);
			else
				isValid = true;
		}
		return i;
	}

}