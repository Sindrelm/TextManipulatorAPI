import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestReplaceTextCommand {

  @Test
  public void testConstructorWithEmptyTarget() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      new ReplaceTextCommand("", "replacement");
    });
    assertEquals("String cannot be empty", exception.getMessage());
  }

  @Test
  public void testGetTarget() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    assertEquals("target", command.getTarget());
  }

  @Test
  public void testGetReplacement() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    assertEquals("replacement", command.getReplacement());
  }

  @Test
  public void testExecute() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    assertEquals("replacement", command.execute("target"));
  }

}
