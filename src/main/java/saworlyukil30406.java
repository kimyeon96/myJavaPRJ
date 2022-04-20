import java.util.Scanner;
public class saworlyukil30406 {
    public static void main(String[] args) {
        Scanner hglee = new Scanner(System.in);
        int hap = 0;
        /* int i; */
        int num1, num2, num3;

        System.out.printf(" 시작 값 입력 : ");
        num1 = hglee.nextInt();
        System.out.printf(" 끝 값 입력 : ");
        num2 = hglee.nextInt();
        System.out.printf(" 증가 값 입력 : ");
        num3 = hglee.nextInt();

        for (int i = num1; i <=num2; i = i + num3) {
            hap += i;
        }

        System.out.println(num1 + "부터 " + num2 + "까지 " + num3 + "씩 증가한 합은 " + hap);
        // 시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다."
        // for문 실행 안되게....
    }
}


