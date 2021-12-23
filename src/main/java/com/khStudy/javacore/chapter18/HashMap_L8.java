package main.java.com.khStudy.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_L8 {

  public static void main(String[] args) {

      HashMap<String, Double> hm = new HashMap<>();
      hm.put("Jon Dow", 333.33);
      hm.put("Mari Angle", 3232.223);
      hm.put("Samuel Beach", 8394.4);
      hm.put("Mon Mali", 84539.32);
      hm.put("Don Alberto", 238923892.2332);

      Set<Map.Entry<String, Double>> set = hm.entrySet();

      for (Map.Entry<String, Double> el: set) {
      System.out.print(el.getKey() + " ");
      System.out.println(el.getValue());
      }
    System.out.println();

      double balance = hm.get("Jon Dow");
      hm.put("Jon Dow", balance + 1000);
    System.out.println("Balance of Jon " + hm.get("Jon Dow"));
  }
}
