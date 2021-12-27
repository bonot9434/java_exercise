import java.io.*;

public class exam4 {
  public static void main(String[] args) throws IOException {
    int x = 1;

    for (int i = 2; i <= 7; i++) {
      x *= i;

      System.out.println(x);
    }
  }
}