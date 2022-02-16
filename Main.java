import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        Scanner text = new Scanner(System.in);
        String letters = text.nextLine();
        try {
            if (letters.charAt(0) == '-' || letters.charAt(0) == '*') {
                String[] splitLetters = letters.split(" ");
                try {
                    for (int i = 0; i < splitLetters.length; i++) {
                        System.out.print(translator.toEnglish(splitLetters[i]));
                    }
                } catch (NullPointerException e) {
                    System.out.println("That morse code does not exist. "+e);
                }
            } else if (letters.charAt(0) != '-' && letters.charAt(0) != '*') {
                for (int i = 0; i < letters.length(); i++) {
                    //if satsen nedan är en felhantering för om användaren skriver en symbol som inte finns i
                    //hashmappen morse, som jag skapade eftersom detta inte orsakar ett NullPointerException
                    if (translator.toMorse(letters.charAt(i)) == null) {
                        System.out.println("You wrote a character that does not have a morse equivalent.");
                        i = letters.length();
                    }
                    if (i < letters.length()) {
                        System.out.print(translator.toMorse(letters.charAt(i)));
                        System.out.print(" ");
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You didn't write anything. "+e);
        }
    }
}