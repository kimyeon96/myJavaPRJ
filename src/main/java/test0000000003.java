import java.util.Scanner;
public class test0000000003 {
    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        System.out.printf("숫자를 입력하세요 ==>");
//        int n = s.nextInt();
//
//        for (int a = n; a <= n; a++) {
//            for (int b = 0; b < a; b++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}
        Scanner s = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 ==>");
        int n = s.nextInt();

        for (int a = n; a >= 0; a--) {
            for (int b = 1; b < a; b++) {
                System.out.println("");
            }
            System.out.printf(" ");
        }
        System.out.println("*");
    }
}