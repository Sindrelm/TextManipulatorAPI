import Modules.CapitalizeText.CapitalizeSelectionCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCapitalizeSelectionCommand {

  @Test
  public void testExecute() {
    //Arrange
    CapitalizeSelectionCommand command = new CapitalizeSelectionCommand("sindre");
    String text = "sindre: Hei jeg heter sindre";
    String textExpected = "Sindre: Hei jeg heter Sindre";

    //Act
    String result = command.execute(text);

    //Assert
    assertEquals(textExpected, result);
  }
}
