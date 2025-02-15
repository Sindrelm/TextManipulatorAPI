import Modules.WrapText.WrapLinesCommand;
import Modules.WrapText.WrapTextCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestWrapLinesCommand {


  @Test
  public void testExecute() {
    //Arrange
    WrapLinesCommand command = new WrapLinesCommand("<", ">");
    String text = """
        Hei
        Verden
        """;
    String textExpected = """
        <Hei>
        <Verden>
        """;
    //Act
    String result = command.execute(text);
    //Assert
    assertEquals(textExpected, result);
  }
}
