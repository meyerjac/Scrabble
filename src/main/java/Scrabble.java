import java.util.ArrayList;
import java.util.List;

public class Scrabble {

  public Integer calculateScore(String word){
    String[] wordArray = word.split("");
    Integer totalScore =0;
    for(int i = 0; i < wordArray.length; i++ ){
      if(wordArray[i].equalsIgnoreCase("d")|| wordArray[i].equalsIgnoreCase("g")){
         totalScore+=2;
      }else if(wordArray[i].equalsIgnoreCase("b") || wordArray[i].equalsIgnoreCase("c") || wordArray[i].equalsIgnoreCase("m")|| wordArray[i].equalsIgnoreCase("p")) {
        totalScore+=3;
      }else if(wordArray[i].equalsIgnoreCase("f") || wordArray[i].equalsIgnoreCase("h") || wordArray[i].equalsIgnoreCase("v")|| wordArray[i].equalsIgnoreCase("w")|| wordArray[i].equalsIgnoreCase("y")) {
        totalScore+=4;
      }else if (wordArray[i].equalsIgnoreCase("k")) {
      totalScore+=5;
      }else if (wordArray[i].equalsIgnoreCase("j")|| wordArray[i].equalsIgnoreCase("x")){
        totalScore +=8;
      }else if (wordArray[i].equalsIgnoreCase("q")|| wordArray[i].equalsIgnoreCase("z")) {
        totalScore+=10;
      }else {
        totalScore++;
      }
    }return totalScore;
}
}
