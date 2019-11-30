import java.util.ArrayList;

public class Game {

	private String userWord;
	private String guessedWord;
	private int wordLength;
	
	public Game(String userWord, String guessedWord, int wordLength) {
		this.setUserWord(userWord);
		this.guessedWord = guessedWord;
		this.wordLength = wordLength;
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
				bullPosition.add(i);
			}
		}
		return bullPosition;
	}
	
	public int getCows() {
		Game game = new Game(userWord, guessedWord, 0);
		int cows = 0;
		ArrayList<Integer> bullPosition = game.bullPosition();
		
		ArrayList<String> Userletters= new ArrayList<>();
		for (int i=0; i< userWord.length(); i++) {
			Userletters.add(userWord.substring(i, i+1));
		}
		
		for (int i=0; i<3; i++) {
			String letter = guessedWord.substring(i, i+1);
			if(!bullPosition.contains(i) && Userletters.contains(letter)) {
				cows++;
			}
			
		}
		
		return cows;
	}
	
	
	public boolean win() {
		Game game = new Game(userWord, guessedWord, 0);
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
