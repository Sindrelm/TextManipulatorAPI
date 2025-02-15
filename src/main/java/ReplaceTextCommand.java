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
    return replacement.replace(target, replacement);
  }
}
