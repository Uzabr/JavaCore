package main.java.com.khStudy.javacore.chapter18;

import java.util.LinkedList;

public class MailList_L7 {

  public static void main(String[] args) {
    LinkedList<Address_L7> mailList = new LinkedList<>();
    mailList.add(new Address_L7("J.W. West", "Urbana", "11 Oak Ave", "IL", "9089" ));
    mailList.add(new Address_L7("Ralph Baker", "Mohamet", "1142 Maple Lane", "IL", "42342" ));
    mailList.add(new Address_L7("Tom Carlton", "Champaign", "867 Elm St", "IL", "84983" ));
    for (Address_L7 elements : mailList) {
      System.out.println(elements + "\n");
      System.out.println();
    }
  }
}
