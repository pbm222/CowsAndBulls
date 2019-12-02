import java.util.ArrayList;

public class Game {

	private String userWord;
	private String guessedWord;
	private int wordLength;
	
	public Game(String userWord, String guessedWord, int wordLength) {
		this.userWord = (userWord);
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
	

	public ArrayList<Integer> getBulls() {
		ArrayList<Integer> getBulls= new ArrayList<>();
		int bulls = 0;
		for(int i=0; i<wordLength; i++) {
			char letterGuessed = guessedWord.charAt(i);
			char letterUser = userWord.charAt(i);
			if(letterGuessed == letterUser) {
				getBulls.add(i);
				bulls++;
			}
		}
		return getBulls;
	}
	
	public int getCows() {
		Game game = new Game(userWord, guessedWord, wordLength);
		int cows = 0;
		ArrayList<Integer> bullPosition = game.getBulls();
		
		ArrayList<String> userLetters= new ArrayList<>();
		for (int i=0; i< wordLength; i++) {
			userLetters.add(userWord.substring(i, i+1));
		}
		
		for (int i=0; i< wordLength; i++) {
			String letter = guessedWord.substring(i, i+1);
			if(!bullPosition.contains(i) && userLetters.contains(letter)) {
				cows++;
			}
			
		}
		
		return cows;
	}
	
	
	public boolean win() {
		Game game = new Game(userWord, guessedWord, wordLength);
		int bulls = game.getBulls().size();
		boolean winOrnot = bulls == wordLength;
		return winOrnot;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
