// Find the longest word in a sentence

import java.util.Scanner;

public class FindTheLongestWord5 {

    // method to find string length
    public static int findingLength(String s) {
        // declaring a count variable
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //
        }
        return count;
    }

    // Method to split text into words using charAt() and manually identifying
    // spaces
    public static String[] textSplit(String text) {
        int length = findingLength(text);
        int wordCount = 1; // There's at least one word
        int[] spaceIndexes = new int[length];
        int spaceIndex = 0;

        // Identify space locations
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i <= spaceIndex; i++) {
            int endIndex = (i == spaceIndex) ? length : spaceIndexes[i];
            words[wordIndex++] = text.substring(startIndex, endIndex).trim();
            startIndex = endIndex + 1;
        }

        return words;
    }

    // Method to find the shortest and longest word in the 2D array
    public static int findLongestWord(String[] wordsWithLengths) {
        
        int longestIndex = 0;

        // Initialize lengths for comparison
        int longestLength = Integer.MIN_VALUE;

        // Find the shortest and longest word
        for (int i = 0; i < wordsWithLengths.length; i++) {
            int length = findingLength(wordsWithLengths[i]) ;
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }

        // Return the indices of the  longest word
        return  longestIndex ;
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence:");
        String inputText = input.nextLine();

        // Split the text into words using the custom method
        String[] words = textSplit(inputText);

        // Find the longest word and its index
        int longestWord = findLongestWord(words);
		

        // Display the  longest word and length
        System.out.println("The text is : ");
		 System.out.println(inputText);
      
        System.out.println(" The Longest word in the text is : " + words[longestWord]);


        input.close();
    }
}