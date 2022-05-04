import java.util.Scanner;
public class Array_list_test01 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    int[] byensue = new int[6];
    int hap;

        System.out.printf("1번째 숫자를 입력하세요 :");
        byensue[0] = s.nextInt();

        System.out.printf("2번째 숫자를 입력하세요 :");
        byensue[1] = s.nextInt();

        System.out.printf("3번째 숫자를 입력하세요 :");
        byensue[2] = s.nextInt();

        System.out.printf("4번째 숫자를 입력하세요 :");
        byensue[3] = s.nextInt();

        System.out.printf("5번째 숫자를 입력하세요 :");
        byensue[4] = s.nextInt();

        System.out.printf("6번째 숫자를 입력하세요 :");
        byensue[5] = s.nextInt();


        hap = byensue[0] + byensue[1] + byensue[2] + byensue[3] + byensue[4] + byensue[5];

        System.out.printf("합계 ==> %d \n", hap);
    }
}