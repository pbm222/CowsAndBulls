
public class testMain {

	public static void main(String[] args) {
		
		String userWord = "cdg";
		
		String guessedWord = "dog";
		
		Game game = new Game(userWord, guessedWord, 0);
		//System.out.println(userWord.charAt(0));
		
		if (game.win() != true) {
		System.out.println("Bulls: "+ game.getBulls());
		System.out.println("Cows: " + game.getCows());
		
		}else {
			System.out.println("You won!");
		}
		


		
		
		
		
		
		
	}

}
