public class IfBasicPractice {
    public static void main(String[] args) {

        // 整数変数の宣言と初期化
        int value = 16;        // ←値を変更しながら実行

        System.out.println("value:" + value);

        // if文の開始
        if (value % 2 == 0 ) {
          System.out.println("偶数です");
        } else {
          System.out.println("奇数です")
        }

    }
}