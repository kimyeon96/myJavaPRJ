import java.util.Scanner;
public class star02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("n을 입력하세요");
        int n = s.nextInt();
        int hap = 0;

        for (int i = 1; i <= n; i++) {
            hap = hap + i;
        }
            if (hap % 2 == 0) {
            }
            System.out.println(hap);
        }
    }
