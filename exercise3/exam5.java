import java.io.*;

public class exam5 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
    int x = Integer.parseInt( br.readLine() );
    int y = Integer.parseInt( br.readLine() );

    System.out.println("平均=" + ((x+y)/2));
  }
}