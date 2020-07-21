package src;

import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Util {
  final private static String separator = " @ ";

  Map<String, String> loadData() {
    Map<String, String> cardData = new HashMap<>();
    try {
      File file = new File("/home/boggie/prg/flashCards/resources/industriellEkonomi.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] pair = line.split(separator);
        cardData.put(pair[0], pair[1]);
      }
    } catch(Exception e) {
      System.out.println(e);
    }
    return cardData;
  }

  void printValues(Map<String, String> cardData) {
    for (Map.Entry<String, String> pair : cardData.entrySet()) {
      System.out.println(pair.getKey() + " : " + pair.getValue());
    }
  }
}
