import java.io.*;

public class exam7_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));
    int score = Integer.parseInt( br.readLine());

    if (score >= 80)
      System.out.println("たいへんよくできました。");
    else if (score >= 60)
      System.out.println("よくできました。");
    else
      System.out.println("ざんねんでした。");
  }
}