import java.io.*;

public class exam8 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));
    int x = Integer.parseInt( br.readLine() );
    int y = Integer.parseInt( br.readLine() );

    if (x >= 60 && y >= 60)
      System.out.println("合格");
    else if ((x + y) >= 130)
      System.out.println("合格");
    else if ((x + y) >= 100 && (x >= 90 || y >= 90))
      System.out.println("合格");
    else
      System.out.println("不合格");
  }
}