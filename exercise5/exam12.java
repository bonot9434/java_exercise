import java.io.*;

public class exam12 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));

    int sum = 0;

    while (sum <= 100)
      sum += Integer.parseInt(br.readLine());
    
    System.out.println("合計は" + sum);
  }
}