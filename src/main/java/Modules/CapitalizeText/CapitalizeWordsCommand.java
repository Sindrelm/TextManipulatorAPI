package Modules.CapitalizeText;

public class CapitalizeWordsCommand extends CapitalizeTextCommand{

  public CapitalizeWordsCommand() {
  }

  @Override
  public String execute(String text) {
    super.verifyText(text);
    StringBuilder result = new StringBuilder();
    String[] splitText = text.split(" ");

    for (String string : splitText) {
      result.append(" ").append(super.capitalizeFirstLetter(string));
    }
    return result.substring(1);
  }
}
