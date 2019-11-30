import java.util.ArrayList;

public class Game {

	private String userWord;
	private String guessedWord;
	//private int wordLength;
	
	public Game(String userWord, String guessedWord) {
		this.setUserWord(userWord);
		this.guessedWord = guessedWord;
	}

	
	public String getUserWord() {
		return userWord;
	}

	public void setUserWord(String userWord) {
		this.userWord = userWord;
	}


	public String getGuessedWord() {
		return guessedWord;
	}

	public void setGuessedWord(String guessedWord) {
		this.guessedWord = guessedWord;
	}
	
	public int getBulls() {
		int bulls = 0;
		for(int i=0; i<userWord.length(); i++) {
			char letterGuessed = guessedWord.charAt(i);
			char letterUser = userWord.charAt(i);
			if(letterGuessed == letterUser) {
				bulls++;
			}
		}
		return bulls;
	}
	
	public ArrayList<Integer> bullPosition() {
		ArrayList<Integer> bullPosition= new ArrayList<>();
		for(int i=0; i<userWord.length(); i++) {
			char letterGuessed = guessedWord.charAt(i);
			char letterUser = userWord.charAt(i);
			if(letterGuessed == letterUser) {
				bullPosition.add(i+1);
			}
		}
		return bullPosition;
	}
	
	public int getCows() {
		Game game = new Game(userWord, guessedWord);
		int cows = 0;
		
		
		return cows;
	}
	
	public boolean win() {
		Game game = new Game(userWord, guessedWord);
		boolean winOrnot;
		int bulls = game.getBulls();
		if(bulls == 3) {
			winOrnot = true;
		}else {
			winOrnot = false;
		}
		return winOrnot;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
