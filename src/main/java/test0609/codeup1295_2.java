package test0609;

import java.util.Scanner;

public class codeup1295_2 {
    public static void main(String[] args) {

        String input = "";
        String output = "";
        int tmp;

        Scanner s = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        input = s.nextLine();


            for (int i = 0; i < input.length(); i++) {
                if ((input.charAt(i) > 64 ) && (input.charAt(i) < 91 )  ){
                    System.out.printf("%c", input.charAt(i) + 32);
                }
                else if ((input.charAt(i) > 96 ) && (input.charAt(i) < 123)) {
                    System.out.printf("%c", input.charAt(i) - 32);
                } else {
                    System.out.printf("%c", input.charAt(i));
                }

            }
    }
}
