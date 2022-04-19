import java.util.Scanner;
public class test0000000000 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 ==>");
        a = sc.nextInt();

        if ((a % 3 == 0) || (a % 5 == 0)) {
            System.out.print("3 또는 5의 배수 입니다. \n");
        }
    }
}
