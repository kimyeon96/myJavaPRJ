import java.util.Scanner;
public class test000000002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.printf("시작 단을 입력하세요 \n");
        n = s.nextInt();
        int k;
        System.out.printf("끝 단을 입력하세요 \n");
        k = s.nextInt();
        int result;
        for (int a=n; a<=k; a++) {
            for (int b=1; b<10; b++) {
                result = a*b;
                System.out.println(a + "*" + b + "=" + a*b);
            }
        }
    }
}
