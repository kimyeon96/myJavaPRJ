import java.util.Scanner;

public class programmingclass_TermTest {
    public static void main(String[] args) {

        //Q1. 내가 입력한 숫자가 홀인지? 짝인지? 출력해주는 프로그램
        //10 -> 짝입니다.   /11 -> 홀입니다.

        //Q2. 내가 입력한 숫자가 3의 배수인지? 5의 배수인지? 3과 5의 배수인지?
        //3의 배수입니다.
        //5의 배수입니다.
        //3과 5의 배수를 둘 다 만족합니다.
        Scanner s = new Scanner(System.in);

        int a;

        System.out.println("숫자를 입력하세요.");
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("짝수입니다.");
        } else {
            System.out.printf("홀수입니다.");
        }
        //Q2
        if ((a % 3 == 0) && (a % 5 == 0)) {  // ==> 3번의 연산수행
            System.out.println("3과 5의 배수를 둘다 만족합니다."); //범위가 제일 큰거가 위로 가야 정상적인 로직이 가능하다.
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }
    }
}

//무조건 이해, 외움.
// 다음 시간때 무조건 쪽지시험 냄