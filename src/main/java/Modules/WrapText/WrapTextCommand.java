package Modules.WrapText;

import Modules.TextCommand;

public class WrapTextCommand implements TextCommand {

  public String opening;
  public String ending;

  public WrapTextCommand(String opening, String ending) {
    verifyString(opening);
    verifyString(ending);

    this.opening = opening;
    this.ending = ending;
  }

  public void verifyString(String string) {
    if (string.isBlank()) {
      throw new IllegalArgumentException("String cannot be blank");
    }
  }

  public String getOpening() {
    return opening;
  }

  public String getEnding() {
    return ending;
  }

  public String execute(String text) {
    return opening + text + ending;
  }
}
