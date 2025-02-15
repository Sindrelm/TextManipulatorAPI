package Modules.CapitalizeText;
import Modules.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  public CapitalizeTextCommand() {
  }

  public String execute(String text) {
    StringBuilder result = new StringBuilder();
    String[] splitText = text.split("\\. ");

    for (String string : splitText) {
      result.append(". ").append(Character.toUpperCase(string.charAt(0))).append(string.substring(1));
    }
    return result.substring(2);
  }
}
