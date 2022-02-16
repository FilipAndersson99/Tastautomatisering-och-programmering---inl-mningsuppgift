import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Tester {
    @Test
    public void translateAToMorse() {
        //Arrange
        Translator test = new Translator();
        //Act
        String actual = test.toMorse('A');
        //Assert
        String expected = "*-";
        assertEquals(expected, actual);
    }
    @Test
    public void translateAToEnglish() {
        //Arrange
        Translator test = new Translator();
        //Act
        char actual = test.toEnglish("*-");
        //Assert
        char expected = 'A';
        assertEquals(expected, actual);
    }
    @Test
    public void translateZToMorse() {
        //Arrange
        Translator test = new Translator();
        //Act
        String actual = test.toMorse('Z');
        //Assert
        String expected = "--**";
        assertEquals(expected, actual);
    }
    @Test
    public void translateZToEnglish() {
        //Arrange
        Translator test = new Translator();
        //Act
        char actual = test.toEnglish("--**");
        //Assert
        char expected = 'Z';
        assertEquals(expected, actual);
    }
}