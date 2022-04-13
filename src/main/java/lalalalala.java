import java.util.Scanner;
public class lalalalala {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        System.out.println("숫자를 입력하시오");
        int result = s.nextInt();

        for(int i=20; i>result; i--) {

            hap = hap + i;
            System.out.println(hap);
        }
    }
}
