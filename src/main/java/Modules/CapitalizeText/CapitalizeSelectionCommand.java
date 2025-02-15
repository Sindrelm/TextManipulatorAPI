package Modules.CapitalizeText;

public class CapitalizeSelectionCommand extends CapitalizeTextCommand{

  private String selection;

  public CapitalizeSelectionCommand(String selection) {
    this.selection = selection;
  }
}
