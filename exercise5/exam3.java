import java.io.*;

public class exam3 {
  public static void main(String[] args) throws IOException {
    int x = 1;

    for (int i = 1; i <= 8; i++) {

      x *= 2;
      System.out.println("2の" + i + "乗" + x);
    }
  }
}