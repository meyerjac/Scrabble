import java.io.Console;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Please enter a scrabble word");
    String inputWord = myConsole.readLine();
    Scrabble connection = new Scrabble();
    Integer score = connection.calculateScore(inputWord);
    System.out.println("your scrabble score for " + inputWord + " is " + score + "!!!!");
  }
}
