// creating method to split the string without the using the split() method and then compare the two string


import java.util.Scanner;


public class SplittingText2{


    //method to find the length of the string without using the length() method;
    public static int returnLength(String str){


        int count = 0;
        try{
            // initializing the loop to count until an exception occur
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


    // method for comparing the strings arrays
    public static boolean compareText(String [] str1, String[] str2){
        int n = str1.length;
        //checking the length are equal or not
        if(str1.length == str2.length){
              for(int i = 0; i<n; i++){
                if(!str1[i].equals(str2[i])){
                    return false;
                }
              }
        }else{
            return false;
        }
        return true;
    }


    public static void main(String []args){
        // Scanner class
        Scanner sc = new Scanner(System.in);


        //input string
        System.out.println("Enter the text line :");
        String str = sc.nextLine();


        String[] customWords = splitString(str);
        String[] prebuitWords = str.split(" ");


        // printing the words of both tha array


        for(int i=0; i<customWords.length; i++){
            System.out.print(customWords[i]+"   ");
            System.out.println(prebuitWords[i]);
        }
       
        boolean ans = compareText(customWords,prebuitWords);
        if(ans){
            System.out.println("The results are identical!");
        }
        else{
            System.out.println("The results are not identical!");
        }
       
       
        sc.close();
    }
}
