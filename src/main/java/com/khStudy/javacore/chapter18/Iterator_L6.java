package main.java.com.khStudy.javacore.chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Iterator_L6 {
  public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("C");
      list.add("F");
      list.add("G");
      list.add("B");
      list.add("A");
    System.out.println("Elements of list :");
      for (String out : list) {
          System.out.println(out + " ");
      }
    System.out.println();
      ListIterator<String> lIterate = list.listIterator();
      while(lIterate.hasNext()) {
          String elements = lIterate.next();
          lIterate.set(elements + " + ");
      }
    System.out.println("Changed Elements ");
      for (String elements : list) {
          System.out.println(elements + " ");
      }
    System.out.println();
    System.out.println("reverse list");
    while(lIterate.hasPrevious()) {
        String el = lIterate.previous();
      System.out.println(el + " ");
    }
    System.out.println();
  }
}
