import java.util.Scanner;

public class BStringProject
	{

		public static void main(String[] args)
			{
				Scanner sentenceInput = new Scanner(System.in);

				System.out.println("Please input any sentence, and I will count the amount of vowels.");

				String sentence = sentenceInput.nextLine();
				int sumOfVowels = 0;

				for (int i = 0; i < sentence.length(); i++)
					{
						if (sentence.substring(i, i + 1).equals("A") || sentence.substring(i, i + 1).equals("a")
								|| sentence.substring(i, i + 1).equals("E") || sentence.substring(i, i + 1).equals("e")
								|| sentence.substring(i, i + 1).equals("I") || sentence.substring(i, i + 1).equals("i")
								|| sentence.substring(i, i + 1).equals("O") || sentence.substring(i, i + 1).equals("o")
								|| sentence.substring(i, i + 1).equals("U") || sentence.substring(i, i + 1).equals("u"))
							{
								sumOfVowels++;

							}

					}
				if (sumOfVowels == 1)
					{
						System.out.println("Your sentence contains " + sumOfVowels + " vowel");

					}
				else
					{
						System.out.println("Your sentence contains " + sumOfVowels + " vowels");
					}

			}

	}
