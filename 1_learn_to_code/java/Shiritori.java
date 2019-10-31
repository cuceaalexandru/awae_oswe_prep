import java.util.ArrayList;

class List {
  ArrayList<String> words = new ArrayList<String>();
  boolean game_over = false;
  
  public static String play(String word){
    int sizeWords = words.size();
    //Check if it is valid
    if (sizeWords < 1) {
      // First play:
      words.add(word);
    }
    else {
      // Not first play, normal run:
      String lastWord = words[sizeWords-1];
      char lastLetterOfLastWord = lastWord.charAt(lastWord.length()-1);
      char firstLetterOfNewWord = word.charAt(0);
      if (lastLetterOfLastWord == firstLetterOfNewWord) {
        words.add(word);
      }
      else {
        //If invalid, return "game over" and set game_over to true
        game_over = true;
        return "game over";
      }
    }
  }
  
  public static String restart() {
    //Set words arrayList to empty
    words = new ArrayList<String>();
    //Set game_over to false
    game_over = false
    return "game restarted";
  }
  
  public static String[] getWords() {
    return words;
  }
  
  public static void main(String[] args) {
    System.out.println("Shiritori");
    
  }  
}