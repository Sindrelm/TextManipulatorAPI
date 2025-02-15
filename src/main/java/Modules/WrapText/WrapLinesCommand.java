package Modules.WrapText;

public class WrapLinesCommand extends WrapTextCommand {

  public WrapLinesCommand(String opening, String ending) {
    super(opening, ending);
  }

  @Override
  public String execute(String text) {
    StringBuilder result = new StringBuilder();
    String[] lines = text.split("\n");

    for (String line : lines) {
      result.append(super.execute(line)).append("\n");
    }
    return result.toString();
  }
}
