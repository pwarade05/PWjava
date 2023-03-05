 import java.util.*;
 public class Stringans3 {
    public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {
                    System.out.print("Enter a sentence: ");
                    String sentence = input.nextLine();
                    String[] words = sentence.split("\\s");
                    String reversedSentence = "";
                    for (int i = 0; i < words.length; i++) {
                        String reversedWord = "";
                        for (int j = words[i].length() - 1; j >= 0; j--) {
                            reversedWord += words[i].charAt(j);
                        }
                        reversedSentence += reversedWord + " ";
                    }
                    System.out.println("Reversed sentence: " + reversedSentence.trim());
                }
            }
        }
