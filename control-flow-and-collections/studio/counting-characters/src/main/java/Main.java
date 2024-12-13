import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        String paragraph="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
//                                 " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                                 " Once you’ve done that, it’s pretty straightforward from there." ;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string to count its characters: ");
        String inputString= input.nextLine();
        inputString = inputString.replaceAll(
                "[^a-zA-Z0-9]", "");
        char[] charArray = inputString.toLowerCase().toCharArray();


        HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
        for(char y: charArray){
            if(charCount.containsKey(y)){
                charCount.put( y, charCount.get(y) + 1);
            } else {
                charCount.put(y,1);
            }
//            System.out.println(y);
        }

        for(Map.Entry<Character,Integer>entry: charCount.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
