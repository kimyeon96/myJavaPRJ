public class programmingclass {
    public static void main(String[] args) {
       /* int a = 99;
        System.out.printf(" AND 연산 : %s \n", (a >= 100) && (a <= 200));
        System.out.printf(" OR 연산 : %s \n", (a >= 100) || (a <= 200));
        System.out.printf(" NOT 연산 : %s \n", !(a == 100)); */

        int a = 99;

        if (a < 100) {
            System.out.printf("100보다 작군요 \n");
            System.out.printf("거짓이므로 이 문장은 안보이겠죠? \n");
        } else {

            System.out.printf("프로그램 끝!");

        }
    }
}