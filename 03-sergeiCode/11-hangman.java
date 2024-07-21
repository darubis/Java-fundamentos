import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // class scanner that allows the user to write
        Scanner scanner = new Scanner(System.in);

        // declaration and assignation
        String secretWord = "intelligent";
        int maxAttemps = 10;
        int attempts = 0;
        boolean guestWord = false;

        // arrays
        char[] guestWords = new char[secretWord.length()];

        // control structure
        for (int i = 0; i < guestWords.length; i++) {
            guestWords[i] = '_';
            System.out.print(guestWords[i]);
        }

        while (!guestWord && attempts < maxAttemps) {
                                                    // it is used when we have a word of chars,
            System.out.println("word to guess: " + String.valueOf(guestWords) + " (" + secretWord.length() + " letters)");

            System.out.println("Please, introduce a letter");

            // use of the class scaner to ask for a letter
            char letter = Character.toLowerCase(scanner.next().charAt(0));

            boolean rightWord = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter){
                    guestWords[i] = letter;
                    rightWord = true;
                }
            }

            if (!rightWord){
                attempts++;
                System.out.println("Wrong word, you have " + (maxAttemps - attempts) + " attempts left.");
            }

            if (String.valueOf(guestWords).equals(secretWord)){
                guestWord = true;
                System.out.println("Congratulations, you have guest the secret word: " + secretWord);
            }
        }

        if (!guestWord){
            System.out.println("Sorry! you don't have more attempts, game over");
        }

        scanner.close();
    }
}

