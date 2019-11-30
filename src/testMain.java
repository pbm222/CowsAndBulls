
public class testMain {

    public static void main(String[] args) {

        String userWord = "talsi";

        String guessedWord = "table";

        Game game = new Game(userWord, guessedWord, userWord.length());
        //System.out.println(userWord.charAt(0));

        if (game.win() != true) {
            System.out.println("Bulls: " + game.getBulls().size());
            System.out.println("Cows: " + game.getCows());

        } else {
            System.out.println("You won!");
        }


    }

}
