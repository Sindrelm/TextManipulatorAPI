public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    verifyString(text);
    return text.replaceFirst(target, replacement);
  }
}
