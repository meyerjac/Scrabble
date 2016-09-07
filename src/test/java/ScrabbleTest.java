import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
    public void calculateScore_returnsScoreForMultipleLetters_2() {
      Scrabble testScrabble = new Scrabble();
      Integer expected = 2;
      assertEquals(expected, testScrabble.calculateScore("aa"));
    }
  @Test
    public void calculateScore_returnsScoreForMultiplePointValues_8() {
      Scrabble testScrabble = new Scrabble();
      Integer expected = 8;
      assertEquals(expected, testScrabble.calculateScore("abba"));
    }
  @Test
    public void calculateScore_returnsScoreForRealWordWithCaps_41() {
      Scrabble testScrabble = new Scrabble();
      Integer expected = 41;
      assertEquals(expected, testScrabble.calculateScore("Quizzify"));
    }
}
