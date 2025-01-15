// Creating custom method for storing and dispalaying splitted words form a text into 2D array

// creating method to split the sring without the using the split() method and then compare the two string

import java.util.Scanner;

public class SplittingTextin2D3{

    //method to find the length of the string without using the length() method;
    public static int returnLength(String str){

        int count = 0;
        try{
            // initailizing the loop to count until an exception occur
        while(true){
            
                str.charAt(count);
                count ++;
              
            }
         }catch(IndexOutOfBoundsException e){
                // Exception is thrown when index exceeds the string length;
            }
           return count; // return the final count.
        
    }

    //method to split the words in the string
    public static String[] splitString(String str){
        int length = returnLength(str);

        // counting the whitespaces to determin the no. of words
        int wordcount = 1;
        for(int i=0; i<length; i++){
           if(str.charAt(i) == ' '){
            wordcount++;
           }
        }

        //initializing the String array for storing the words
        String [] words = new String[wordcount];
        int wordStart = 0, wordIndex = 0; 

        for(int i=0; i<length; i++){
            if(str.charAt(i) == ' ' || i == length - 1){
                // calculating the end index of the word
                int wordEnd = (str.charAt(i) == ' ') ? i : i+1;

                //extacting the word from the text and storing in the array
                words[wordIndex] = str.substring(wordStart, wordEnd);
                wordIndex++;

                wordStart = i + 1;
            }
        }
        return words;
    }

     // method for creating a 2D array of words and their lengths
     public static String[][] ConvertTo2D(String words[]){

        String wordLength = ""; // initializing wordlength;
        int row = words.length;
        int columns = 2;
    
        //Decalaring the 2D array 
        String[][] words2D = new String[row][columns];

        for(int i=0; i< row; i++){

            wordLength = String.valueOf(returnLength(words[i]));
            for(int j=0; j<columns; j++){
                 
                if(j == 0){
                    // storing word in first cloumns
                    words2D[i][j] = words[i];
                }
                else{
                    //storing length of word in second columns
                    words2D[i][j] = wordLength;
                }
            }
        }
        return words2D;

     }

    public static void main(String []args){
        // Scanner class
        Scanner sc = new Scanner(System.in);

        //input string
        System.out.println("Enter the text line :");
        String str = sc.nextLine();

        String[] customWords = splitString(str);
     

        String [][] new2DStrings = ConvertTo2D(customWords);
        // priting the wordsn 2D array

        int rowLine = new2DStrings.length;
        int columnLine = 2;
        System.out.println("The resulting table is :");

        for(int i=0; i< rowLine; i++){
            for(int j=0; j<columnLine; j++){
                if(j==1){
                    System.out.print(Integer.parseInt(new2DStrings[i][j]));
                }else
                System.out.print(new2DStrings[i][j]+" --- ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}