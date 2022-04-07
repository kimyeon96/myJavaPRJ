import java.util.Scanner;

public class silseopformoon0406 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;

        System.out.printf(" 시작 값 입력 : ");
        num1 = s.nextInt();
        System.out.printf(" 끝 값 입력 : ");
        num2 = s.nextInt();
        System.out.printf(" 증가 값 입력 : ");
        num3 = s.nextInt();

        if (num1 > num2) {
            System.out.println("시작값이 끝값보다 큽니다.");
        } else {
            for (int i = num1; i <=num2; i = i + num3) {
                hap += 1;
            }
        }
    }
}
