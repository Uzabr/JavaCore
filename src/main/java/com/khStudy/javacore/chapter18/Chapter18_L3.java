package main.java.com.khStudy.javacore.chapter18;

import java.util.LinkedList;

public class Chapter18_L3 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("F");
    list.add("B");
    list.add("D");
    list.add("E");
    list.add("C");
    list.addLast("Z");

    list.addFirst("A1");
    list.add(1, "A");

    System.out.println("Elements of list " + list);

    list.remove("F");
    list.remove(2);

      System.out.println("Elements of list " + list);

      list.removeFirst();
      list.removeLast();
      System.out.println("Elements of list " + list);

      String l = list.get(2);
      list.set(2, l + " changed");

      System.out.println("Elements of list after changing " + list);
  }
}
