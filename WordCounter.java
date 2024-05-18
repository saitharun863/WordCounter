import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String input = scanner.nextLine();

		int wordCount = countWords(input);
		System.out.println("The number of words in the sentence is: " + wordCount);
		scanner.close();
	}
	

	public static int countWords(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		String[] words = str.trim().split(" ");
		return words.length;
	}
}
