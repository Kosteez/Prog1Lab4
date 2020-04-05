import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input, input2, rev = "";

		System.out.println("Enter any word or sentence: ");
		input = sc.nextLine();
		input2 = input.toLowerCase().replaceAll(" ", "");
		int length = input2.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + input2.charAt(i);
		if (input2.equals(rev)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome because " + rev + " isn't the opposite of " + input2);
		}

	}
}