package test;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 0)
                System.out.printf("%c", '$');
            else
                System.out.printf("%c", str.charAt(i));
        }
    }
}
