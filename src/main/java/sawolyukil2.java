import java.util.Scanner;

public class sawolyukil2 {
    public static void main(String[] args) {

        /* 1번째 실습 int i;

        for (i = 1; i < 6; i++) {
            System.out.println(i + "번째입니다.");
        } */

         int hap = 0;
        int i;

        for (i = 1; i < 11; i++) {
            System.out.println("hap : "+ hap + " | i : " +1);
            hap += i;
            System.out.println("더한값 : "+ hap);
            System.out.println("--------------");
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);

    /*2번째 요구사항 문제    int fac = 1;
        for(int i2 = 5; i2 > 0; i2--) {
            fac *= i2;

        } System.out.println("중간 계산 값 : "+ fac);

        System.out.println("5! 값은 "+ fac); */


      /*  Scanner s = new Scanner(System.in);

        int hap=0;
        int i;
        int num;

        System.out.printf("값 입력 : ");
        num = s.nextInt();

        for (i = 1; i <= num; i++) {
            hap += i;
        }

        System.out.printf(" 1에서 %d까지의 합: %d \n", num, hap);
        /* System.out.println("1부터 " + num + "까지 합은" + hap); */
    }
}
