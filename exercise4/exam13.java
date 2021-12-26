import java.io.*;

public class exam13 {
  public static void main( String[] args ) throws IOException{
    BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
    System.out.println("何月ですか");
    int month = Integer.parseInt( br.readLine() );

    switch( month ) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println( "31日です" );
        break;
      case 2:
        System.out.println( "28日です" );
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println( "30日です" );
        break;
      default:
        System.out.println( "入力が間違っています" );
        break;
    }
  }
}