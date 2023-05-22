import java.util.Scanner;

//still need to debug
public class WordCounter {

    public static void run(){
        System.out.println("Welcome to the Vowel and Consonant Calculator");
        Scanner in = new Scanner(System.in);
        System.out.println("Insert String: ");
        String input = in.nextLine();

        System.out.println("Inputted String:");
        System.out.println(input);
        System.out.print("Vowels: ");
        System.out.println(countVowels(input));
        System.out.print("Consonants: ");
        System.out.println(countConsonants(input));
    }

    private static int countVowels(String input) {
        int vowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    private static int countConsonants(String input) {
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(ch) && !isVowel(ch)) {
                consonants++;
            }
        }
        return consonants;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
