import Modules.WrapText.WrapSelectionCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestWrapSelectionCommand {

  @Test
  public void testExecute() {
    //Arrange
    WrapSelectionCommand command = new WrapSelectionCommand("Sindre", "!!", "!!");
    String text = "Hei, jeg heter Sindre og er 20 år. Forresten, jeg heter Sindre";
    String textExpected = "Hei, jeg heter !!Sindre!! og er 20 år. Forresten, jeg heter !!Sindre!!";
    //Act
    String result = command.execute(text);

    //Assert
    assertEquals(textExpected, result);
  }
}
