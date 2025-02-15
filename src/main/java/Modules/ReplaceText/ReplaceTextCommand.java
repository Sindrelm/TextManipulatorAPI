package Modules.ReplaceText;

import Modules.TextCommand;

public class ReplaceTextCommand implements TextCommand {

  public String target;
  public String replacement;

  public ReplaceTextCommand(String target, String replacement) {

    verifyString(target);
    verifyString(replacement);

    this.target = target;
    this.replacement = replacement;
  }

  public void verifyString(String string) {
    if (string.isBlank()) {
      throw new IllegalArgumentException("String cannot be empty");
    }
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }

  public String execute(String text) {
    StringBuilder result = new StringBuilder();
    int targetLength = target.length();
    int i = 0;

    while (i < text.length()) {
      if (text.startsWith(target, i)) {
        result.append(replacement);
        i += targetLength;
      }
      else {
        result.append(text.charAt(i));
        i++;
      }
    }
    return result.toString();

  }
}
