package Modules.WrapText;

public class WrapSelectionCommand extends WrapTextCommand {

  private String selection;

  public WrapSelectionCommand(String selection, String opening, String ending) {
    super(opening, ending);

    verifyString(selection);
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    StringBuilder result = new StringBuilder()
    String[] splitText = text.split(selection);

    for(String string : splitText) {
      if (string.equals(selection)) {
        result.append(super.execute(string));
      }
      else {
        result.append(string);
      }
    }
    return result.toString();
  }
}
