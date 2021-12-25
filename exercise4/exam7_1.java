import java.io.*;

public class exam7_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));
    int score = Integer.parseInt( br.readLine());

    if (score >= 60)
      System.out.println("合格");
    else
      System.out.println("不合格");
  }
}