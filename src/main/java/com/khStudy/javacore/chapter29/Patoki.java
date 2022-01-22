package main.java.com.khStudy.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Patoki {

  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();
    myList.add(2);
    myList.add(5);
    myList.add(6);
    myList.add(8);
    myList.add(23);
    System.out.println("Isxodniy List" + myList);

    Stream<Integer> stream = myList.stream();
    Optional<Integer> minVal = stream.min(Integer::compare);
    if (minVal.isPresent()) System.out.println("Min val " + minVal.get());

    stream = myList.stream();
    Optional<Integer> maxVal = stream.max(Integer::compare);
    if (maxVal.isPresent()) System.out.println("Max val " + maxVal.get());

    Stream<Integer> sortedStream = myList.stream().sorted();
    System.out.println("Sortirovanniy patok");
    sortedStream.forEach(System.out::println);
    System.out.println();

    Stream<Integer> oddValue = myList.stream().filter(x -> (x%2 == 1));
    oddValue.forEach(System.out :: println);
    System.out.println();
    
  }
}
