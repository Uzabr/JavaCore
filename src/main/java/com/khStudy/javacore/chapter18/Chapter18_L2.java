package main.java.com.khStudy.javacore.chapter18;

import java.util.ArrayList;

public class Chapter18_L2 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);

    System.out.println("Содержимое списочного массива " + al);

    Integer[] arr = new Integer[al.size()];
    arr = al.toArray(arr);

    int sum =0;
    for (Integer i: arr) sum += i;
    System.out.println(sum);
  }
}
