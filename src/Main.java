import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
  private Map<String, String> cardData = new HashMap<>();
  private String seperator = "@";

  void loadData() {
    try {
      File file = new File("/home/boggie/prg/flashCards/resources/industriellEkonomi.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] pair = line.split(seperator);
        cardData.put(pair[0], pair[1]);
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }

  void printValues() {
    for (Map.Entry<String, String> pair : cardData.entrySet()) {
      System.out.println(pair.getKey() + " : " + pair.getValue());
    }
  }

  public static void main(String[] args) {
    Main m = new Main();
    m.loadData();
    m.printValues();
    // m.startGUI(cardData);
  }
}
