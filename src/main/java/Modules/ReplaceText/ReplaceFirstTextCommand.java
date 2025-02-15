package Modules.ReplaceText;

public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    boolean firstTime = true;

    while (i < text.length()) {
      if (text.startsWith(target, i) && firstTime) {
        result.append(replacement);
        i += target.length();
        firstTime = false;
      }
      else {
        result.append(text.charAt(i));
        i++;
      }
    }
    return result.toString();
  }
}
