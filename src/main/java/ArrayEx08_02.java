import java.util.Scanner;
public class ArrayEx08_02 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int[] aa = new int[4];
//        int hap;
//
//        System.out.printf("1번째 숫자를 입력하세요 : ");
//        aa[0] = s.nextInt();
//        System.out.printf("2번째 숫자를 입력하세요 : ");
//        aa[1] = s.nextInt();
//        System.out.printf("3번째 숫자를 입력하세요 : ");
//        aa[2] = s.nextInt();
//        System.out.printf("4번째 숫자를 입력하세요 : ");
//        aa[3] = s.nextInt();
//
//        hap = aa[0] + aa[1] + aa[2] + aa[3];
//
//        System.out.println(" 합계 :" + hap);
//
//        for(int i = 0; i <4; i++) {
//            System.out.println("aa[" + i + "] = " + aa[i]);
//        }
//    }
//}
//       ↓ 8-3 예제
//        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요.", i + 1);
            aa[i] = s.nextInt();
        }

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.println("합계 : " + hap);
    }
}