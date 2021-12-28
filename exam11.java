import java.io.*;

public class exam11 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++)
      System.out.print(i % 10);
  }
}

// for( int i = 0, out = 0 ; i < count ; i++ ) {
//   System.out.print( out++ );
//     if( out > 9 )
//       out = 0;
// }