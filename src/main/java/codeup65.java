import java.util.Scanner;
public class codeup65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("");
        int a = s.nextInt();
        System.out.printf("");
        int b = s.nextInt();
        System.out.printf("");
        int c = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%d \n", a);
        }
        if (b % 2 == 0) {
            System.out.printf("%d \n", b);
        }
        if (c % 2 == 0) {
            System.out.printf("%d \n", c);
        }
    }
}