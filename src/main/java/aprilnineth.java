import java.util.Scanner;
public class aprilnineth {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("숫자를 입력하세요");
        a = scan.nextInt();

        if (a%2==0) {
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }
}
