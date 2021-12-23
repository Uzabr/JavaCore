package main.java.com.khStudy.javacore.chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class SplitIterator_L7 {
  public static void main(String[] args) {
    ArrayList<Double> vals = new ArrayList<>();
    vals.add(1.0);
    vals.add(2.0);
    vals.add(3.0);
    vals.add(4.0);
    vals.add(5.0);
    System.out.print("Elements of arraylist \n");
    Spliterator<Double> spliterator = vals.spliterator();
    while(spliterator.tryAdvance(n -> System.out.println(n)));
    System.out.println();
    spliterator = vals.spliterator();
    ArrayList<Double> sqr = new ArrayList<>();
    while(spliterator.tryAdvance(n -> sqr.add(Math.sqrt(n))));

    spliterator = sqr.spliterator();
    spliterator.forEachRemaining(System.out :: println);
  }
}
