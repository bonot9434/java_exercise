import java.io.*;

public class exam10 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++)
      System.out.print("*");
  }
}