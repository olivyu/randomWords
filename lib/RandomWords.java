package randomWords;

import java.util.Random;
import java.util.Scanner;

public class RandomWords {

	static int letterCount = 5;
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	static LinkList listofWords;
	static int numberofWords;

	public static void main(String[] args) {
		System.out.println("Welcome to the Random Word Generator!");
		while(true){
			System.out.println("How many words (15-240) do you want to see? Or press (q) to quit.");
			String num = input.nextLine();
			if (num.equals("q")){
				return;
			}
			else{
				start(num);
			}
		}

	}
	
	public static void start(String num) {
		try {
			numberofWords = Integer.parseInt(num); //Integer.valueOf(num).intValue();
		}
		catch (NumberFormatException e){
			System.out.println("Exception thrown  :" + e);
			System.out.println("Please put in an integer.");
		}
		if (numberofWords > 240 || numberofWords < 15) {
			System.out.println("Between 15 to 240 words!");
		}
		else {
			//String word = generate(letterCount);
			//listofWords = new LinkList(word);
			listofWords = new LinkList();
			for (int i = 0; i < numberofWords; i++) {
				String word = generate(letterCount);
				listofWords.insert(word,false);	
			}
			listofWords.display();
			while(true){
				System.out.println();
				System.out.println("(D) Delete   (A) Add   (Q) Quit");
				String command = input.nextLine();
				command = command.toUpperCase();
				if (command.equals("Q")){
					return;
				}
				else{
					nextStep(command);
				}
			}
			
		}
	}
	
	public static void nextStep(String command) {
		if (command.equals("D")) {
			System.out.println("Which word do you want to delete?");
			String deletedWord = input.nextLine();
			deletedWord = deletedWord.toLowerCase();
			try {
				listofWords.delete(deletedWord);
				numberofWords--;
				listofWords.display();
			}
			catch (NullPointerException e){
				System.out.println("Exception thrown  :" + e);
				System.out.println("That is not a word on the list.");
			}
		}
		else if (command.equals("A")) {
			String addedWord = generate(letterCount);
			listofWords.insert(addedWord,true);
			numberofWords++;
			listofWords.display();
		}
		else {
			System.out.println("Please pick one of the options!");
		}
	}
	
	public static String generate(int letterCount) {
		String word = "";
		for (int j = 0; j < letterCount; j++){
			char next = (char)(random.nextInt(26) + 'a');
			word += Character.toString(next);
		}
		return word;
	}
}
	
