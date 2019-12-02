import java.util.Scanner;

public class testMain {

    public static void main(String[] args) {
        System.out.println("Hello, my dear friend! Let's play a game: Cows and Bulls! ");
        System.out.println("\n");
        System.out.println("Please enter the number of letters in a word you want to guess:");
        Scanner sc = new Scanner(System.in);
        int wordLength = sc.nextInt();

        Reader dictionaryReader = new Reader();
        String guessedWord = dictionaryReader.getRandomWord(wordLength);

        System.out.println("Try to guess a word:");
        Scanner ab = new Scanner(System.in);
        String userWord = ab.nextLine();
        Game game = new Game(userWord, guessedWord, wordLength);

        do {
            System.out.println("Bulls: " + game.getBulls().size());
            System.out.println("Cows: " + game.getCows());

            System.out.println("Try harder! New try : ");
            ab = new Scanner(System.in);
            userWord = ab.nextLine();
            game.setUserWord(userWord);

        } while (!game.win());

        System.out.println("You are a champion!!!");


    }

}
