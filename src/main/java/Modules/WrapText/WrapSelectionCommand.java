package Modules.WrapText;

import Modules.ReplaceText.ReplaceTextCommand;

public class WrapSelectionCommand extends WrapTextCommand {

  private final String selection;

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
    ReplaceTextCommand replaceCommand = new ReplaceTextCommand(selection, super.execute(selection));
    return replaceCommand.execute(text);
  }
}
