import java.util.Scanner;
public class Ex06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("단 입력하라: ");
        int i = s.nextInt();

        for(int a = i; a<=i; a++) {
            for (int gop = 1; gop <10; gop++) {
                System.out.printf("입력한 단만 구구단 출력하기 : %d * %d = %d \n",a,gop,a*gop);
            }
        }
    }
}