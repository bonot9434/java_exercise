import java.io.*;

public class exam2 {
  public static void main( String[] args ) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));

    int x = Integer.parseInt( br.readLine() );
    int y = Integer.parseInt( br.readLine() );

    if (x>y)
      System.out.println(x);
    else
      System.out.println(y);
  }
}