package Modules.CapitalizeText;
import Modules.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  public CapitalizeTextCommand() {
  }

  public void verifyText(String text) {
    if (text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be blank");
    }
  }

  public String capitalizeFirstLetter(String text) {
    return Character.toUpperCase(text.charAt(0)) + text.substring(1);
  }

  public String execute(String text) {
    verifyText(text);
    StringBuilder result = new StringBuilder();
    String[] splitText = text.split("\\. ");

    for (String string : splitText) {
      result.append(". ").append(capitalizeFirstLetter(string));
    }
    return result.substring(2);
  }
}
