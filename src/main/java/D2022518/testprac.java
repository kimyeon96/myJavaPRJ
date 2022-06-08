package D2022518;
import java.util.Scanner;

public class testprac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력==>");
        str = s.nextLine();

        System.out.print("출력 문자열==> ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'T')
            System.out.printf("%c", 'U');
            else if (str.charAt(i)==' ')
                System.out.printf("%c",'!');
            else if (str.charAt(i)=='C')
                System.out.printf("%c",'D');
            else if (str.charAt(i)=='o')
                System.out.printf("%c",'p');
            else if (str.charAt(i)=='K')
                System.out.printf("%c",'1');
            else if (str.charAt(i)=='B')
                System.out.printf("%c",'c');
            else if (str.charAt(i)=='.')
                System.out.printf("%c",'/');
            else if (str.charAt(i)=='J')
                System.out.printf("%c",'K');
            else
                System.out.printf("%c",str.charAt(i));
            }
        }
    }