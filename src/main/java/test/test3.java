package test;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
//        String str = "IT CookBook. Java";
//        int len;
//
//        len = str.length();
//
//        System.out.printf("문자열 : %s \n", str);
//        System.out.printf("문자열 길이 : %d \n", len);
//
//        System.out.printf("\n");
//        System.out.printf("-------------");
//        System.out.println("");

        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o')
              System.out.printf("%c", '$');
            else
            System.out.printf("%c", str.charAt(i));
        }
    }
}