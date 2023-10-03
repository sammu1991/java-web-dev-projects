
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

    public class Countingcharacters {

        public static void main (String[] args) {

            Scanner input = new Scanner(System.in);
            HashMap<Character, Integer> chars = new HashMap<>();
            System.out.println("Please enter a sentence:");
            String sentence = input.nextLine();

            char[] charsInSentence = sentence.toCharArray();

            for (char a : charsInSentence) {

                if (!chars.containsKey(a)) {
                    chars.put(a, 0);
                }
                if (chars.containsKey(a)) {
                    chars.put(a, chars.get(a) + 1);
                }
            }

            for (Map.Entry<Character, Integer> a : chars.entrySet()) {
                System.out.println(a.getKey() + ":" + a.getValue());
            }

        }
    }

