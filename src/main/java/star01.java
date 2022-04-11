import java.util.Scanner;
public class star01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int a;
        a = sc.nextInt();

        for (int i = 0; i < a+1; i++) {
            System.out.print(i);
            for(int j = a; j > 0; j--) {
                System.out.print(j);
                if(i<j) {
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}