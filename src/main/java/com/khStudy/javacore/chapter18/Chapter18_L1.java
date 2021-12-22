package main.java.com.khStudy.javacore.chapter18;

import java.util.ArrayList;

public class Chapter18_L1 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();

    System.out.println("Началный размер списочного массива " + list.size());
    list.add("C");
    list.add("A");
    list.add("E");
    list.add("B");
    list.add("D");
    list.add("F");
    list.add(1, "A2");
    System.out.println("Размер списсочного массива после ввода элементов " + list.size());

    System.out.println("Содержимое списочного массива " + list);

    list.remove("F");
    list.remove(2);

    System.out.println("Размер списсочного массива после удаления элементов ввода элементов " + list.size());

    System.out.println("Содержимое списочного массива " + list);
  }
}
