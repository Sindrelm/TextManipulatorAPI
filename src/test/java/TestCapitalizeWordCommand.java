import Modules.CapitalizeText.CapitalizeWordsCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCapitalizeWordCommand {

  @Test
  public void testExecute() {
    //Arrange
    CapitalizeWordsCommand command = new CapitalizeWordsCommand();
    String text = "yolo. YODO. jeg heter sindre. lmao. LMAO. hei verden.";
    String textExpected = "Yolo. YODO. Jeg Heter Sindre. Lmao. LMAO. Hei Verden.";

    //Act
    String result = command.execute(text);

    //Assert
    assertEquals(textExpected, result);
  }
}
