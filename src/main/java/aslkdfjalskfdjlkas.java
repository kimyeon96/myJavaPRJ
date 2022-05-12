import java.util.Scanner;
public class aslkdfjalskfdjlkas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1, num2, num3;

        System.out.printf("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.printf(" 끝값 입력 : ");
        num2 = s.nextInt();
        System.out.printf(" 증가값 입력 : ");
        num3 = s.nextInt();

        for (i=1; 1<=num2; i++) {
            hap = hap + i;
        }

        System.out.printf(" %d에서 %d까지 %d식 증가한 값의 합: %d \n", num1, num2, num3, hap);
    }
}
