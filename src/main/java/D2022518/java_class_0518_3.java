package D2022518;//교재 304p, startsWith() 와 endsWith()
import java.util.Scanner;
public class java_class_0518_3 {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        String str;

        System.out.print("문자열 입력 ==>");
        str = s.nextLine();

        System.out.print("출력 문자열 ==>");

        if (!str.startsWith(")")) {
            System.out.printf(")");

            for (int i = 0; i < str.length(); i++)
                System.out.printf("%c", str.charAt(i));

            System.out.printf(str);

            if (!str.endsWith(")"))
                System.out.printf(")");
        }

        //Access_log 서버 로그 샘플
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900";
    }
}
