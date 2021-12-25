import java.io.*;

public class exam7_3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));
    int score = Integer.parseInt( br.readLine());

    if (score >= 80)
      System.out.println("優");
    else if (score >= 70)
      System.out.println("良");
    else if (score >= 60)
      System.out.println("可");
    else
      System.out.println("不可");
  }
}