import java.util.Scanner;
public class pyramid_test {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner s = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();
        System.out.printf("세번째 계산할 값을 입력하세요 ==>");
        c = s.nextInt();
        System.out.printf("네번째 계산할 값을 입력하세요 ==>");
        d = s.nextInt();
        System.out.printf("네번째 계산할 값을 입력하세요 ==>");

        System.out.printf("%d+%d-%d*%d=%d", a,b,c,d,a+b-c*d);
    }
}
