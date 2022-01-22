package main.java.com.khStudy.javacore.chapter22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WriteServer {
    public static int serverPort = 998;
    public static int clientPort = 999;
    public static int buffer_size = 1024;
    public static DatagramSocket ds;
    public static byte[] buffer = new byte[buffer_size];

    public static void theServer() throws Exception {
        int pos = 0;
        while (true) {
            int c = System.in.read();
            switch (c) {
                case -1:
          System.out.println("Server zavershaet seans svyazi ");
          ds.close();
          return;
                case '\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
                    pos = 0;
                    break;
                default:
                    buffer[pos] = (byte) c;
      }
        }
    }

    public static void theClient() throws Exception {
        while (true) {
            DatagramPacket dp = new DatagramPacket(buffer,buffer.length );
            ds.receive(dp);
      System.out.println(new String(dp.getData(), 0, dp.getLength()));
        }
    }

  public static void main(String[] args) throws Exception {
    if (args.length == 1) {
      ds = new DatagramSocket(serverPort);
      theServer();
        }
    else {
        ds = new DatagramSocket(clientPort);
        theClient();
    }
  }
}
