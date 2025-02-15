import Modules.WrapText.WrapTextCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestWrapTextCommand {

  @Test
  public void testEmptyOpeningInConstructor() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      new WrapTextCommand("", "ending");
    });
    assertEquals("String cannot be blank", exception.getMessage());
  }

  @Test
  public void testGetOpening() {
    WrapTextCommand command = new WrapTextCommand("opening", "ending");
    assertEquals("opening", command.getOpening());
  }

  @Test
  public void testGetEnding() {
    WrapTextCommand command = new WrapTextCommand("opening", "ending");
    assertEquals("ending", command.getEnding());
  }

  @Test
  public void testExecute() {
    WrapTextCommand command = new WrapTextCommand("<", ">");
    assertEquals("<text>", command.execute("text"));
  }
}
