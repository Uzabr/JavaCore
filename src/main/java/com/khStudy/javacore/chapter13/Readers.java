package main.java.com.khStudy.javacore.chapter13;


import java.util.ArrayList;
import java.util.List;

public class Readers{
  public static void main(String[] args) throws Exception {

      List<String > l = new ArrayList<>();
      l.add("Pasda");
      l.add("Pasda");
      l.add("Bafa");
      for(String i : l) {
          if(i.indexOf("P") == 0) {
              continue;
          }
          else
          {
        System.out.println(i+ " ");
          }
      }

//
//      String s = "This is the character copyright &copy; " +
//              ", &copy - net.\n";
//      byte[] b = s.getBytes();
//      ByteArrayInputStream bn = new ByteArrayInputStream(b);
//      int c;
//      boolean marked = false;
//      try(BufferedInputStream buff = new BufferedInputStream(bn)) {
//      while ((c = buff.read()) != -1) {
//        switch (c) {
//          case '&':
//            if (!marked) {
//              buff.mark(32);
//              marked = true;
//            } else {
//              marked = false;
//            }
//            break;
//          case ';':
//            if (marked) {
//              marked = true;
//              System.out.print("( c )");
//            } else {
//              System.out.print((char) c);
//            }
//            break;
//          case ' ':
//            if (marked) {
//              marked = false;
//              buff.reset();
//              System.out.print("&");
//            } else System.out.print((char) c);
//            break;
//          default:
//            if (!marked) System.out.print((char) c);
//            break;
//        }
//              }
//      }
//      catch(IOException e) {
//      System.out.println(e);
//      }


  }
}

