import Modules.ReplaceText.ReplaceFirstTextCommand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestReplaceFirstTextCommand {

  @Test
  public void testConstructorWithEmptyTarget() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      new ReplaceFirstTextCommand("", "replacement");
    });
    assertEquals("String cannot be empty", exception.getMessage());
  }

  @Test
  public void testGetTarget() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
    assertEquals("target", command.getTarget());
  }

  @Test
  public void testGetReplacement() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
    assertEquals("replacement", command.getReplacement());
  }

  @Test
  public void testExecute() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
    assertEquals("replacement, target, target", command.execute("target, target, target"));
  }

}
