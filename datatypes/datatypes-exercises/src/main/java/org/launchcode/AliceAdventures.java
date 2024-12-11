package org.launchcode;

import java.util.Scanner;

public class AliceAdventures {

    public static void main(String[] args){
        String aliceLine="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word you want to find: ");
        String word= input.nextLine();
        if( aliceLine.contains(word))
       {
           System.out.println(" This sentence has " + word +".");

       }else{
            System.out.println("Sorry!! This word is not in this sentence");
        }
       //Find the index and length of the inputWord
        Integer indexOfTheWord=aliceLine.indexOf(word);
        Integer lengthOfTheWord= word.length();

        System.out.println("The index and length of the word is "+ indexOfTheWord+" and "+ lengthOfTheWord);
        //Replace the given inputWord
        System.out.println("Replace with:");
        String replacementWord= input.nextLine();
        String modifiedSentence= aliceLine.replaceAll(word,replacementWord);
        System.out.println(modifiedSentence);


    }

}

