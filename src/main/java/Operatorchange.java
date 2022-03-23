public class Operatorchange {
    public static void main(String[] args) {
        /*int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf("%d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf("%d + %d * %d = %d \n", a, b, c, result1);

        result2 = a * b / (float) c;
        System.out.printf(" %d * %d / %d = %f \n", a, b, c, result2);

        mok = c / b;
        System.out.printf(" %d / %d의 몫은 %d\n", c, b, mok);

        namugi = c % b;
        System.out.printf("%d/%d의 나머지는 %d\n", c, b, namugi); */

        /*int a = 10;

        a++;
        System.out.printf("a ++ ==> %d \n", a);

        a--;
        System.out.printf("a -- ==> %d \n", a);

        a += 5;
        System.out.printf("a +=5 ==> %d \n", a);

        a -= 5;
        System.out.printf("a -= 5 ==> %d \n", a);

        a *=5;
        System.out.printf("a *= 5 ==> %d \n", a);

        a %= 5;
        System.out.printf("a %%= 5 ==> %d \n", a); */


        int a = 10, b;

        // a+1 하기 전에 b에 먼저 a값을 저장하고, a+1 실행
        b = a++;
        // b = 10 // a = 11
        System.out.printf("%d \n", b); //10

        //a =11
        b = ++a;
        System.out.printf("%d \n", b);
    }
}
