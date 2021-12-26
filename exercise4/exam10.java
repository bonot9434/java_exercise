import java.io.*;

public class exam10 {
    public static void main( String[] args ) throws IOException{
      BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
      int x = Integer.parseInt( br.readLine() );
      int y = Integer.parseInt( br.readLine() );

      if (x < y && (x%2) == 0 && (y%2) == 0)
        System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
      if (x == y && x < 0)
        System.out.println("x は y より小さい、または、x は偶数である。");
      if ( x < y || ( x % 2 ) == 0 )
        System.out.println( "xはyより小さい、または、xは偶数である。" );
      if (x <= 10 || x >= 100 && y >= 10 || y <= 100)
        System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
      if (!(x < 0 && y < 0))
        System.out.println( "xもyも負の数である、ではない。" );
    }
}