package main.java.com.khStudy.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Date;

public class Whois {
  public static void main(String[] args) throws Exception {
    URL hp = new URL("http://www.internic.net");
    URLConnection urlc = hp.openConnection();
    long date = urlc.getDate();
    if (date == 0) System.out.println("No date");
    else System.out.println("date is :" + new Date(date));

    System.out.println("Soderjimoe :" + urlc.getContentType());
    date = urlc.getExpiration();
    System.out.println("Srok deystvie :" + new Date(date));
    date = urlc.getLastModified();
    System.out.println(new Date(date));
    date = urlc.getContentLengthLong();
    System.out.println(date);

    int c;
    if (date != 0) {
      System.out.println("Soderjimoe");
      InputStream in = urlc.getInputStream();
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
      in.close();
    }
  }
}
