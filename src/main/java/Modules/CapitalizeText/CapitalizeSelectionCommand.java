package Modules.CapitalizeText;

import Modules.ReplaceText.ReplaceTextCommand;

public class CapitalizeSelectionCommand extends CapitalizeTextCommand{

  private String selection;

  public CapitalizeSelectionCommand(String selection) {
    verifyText(selection);
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
