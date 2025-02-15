import Modules.CapitalizeText.CapitalizeTextCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCapitalizeTextCommand {

  @Test
  public void testExecute() {
    //Arrange
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    String text = "faen ass. shift knappen fungerer ikke. klikker";
    String expectedResult = "Faen ass. Shift knappen fungerer ikke. Klikker";

    //Act
    String result = command.execute(text);

    //Assert
    assertEquals(expectedResult, result);
  }
}
