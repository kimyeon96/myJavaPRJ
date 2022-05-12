import java.util.Scanner;
public class Array_0001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0, i;

        for (i =0; i <= 3; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = s.nextInt();
        }
    }
}
