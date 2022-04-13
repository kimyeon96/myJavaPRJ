import java.util.Scanner;
public class Ex06_12_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int dan;
        System.out.printf("몇단?");
        dan = s.nextInt();

        for(i = 1; i < 10; i++) {
            System.out.println(dan + "X" + i + "=" + dan*i);
        }
    }
}