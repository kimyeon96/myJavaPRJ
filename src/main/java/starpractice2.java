public class starpractice2 {
    public static void main(String[] args) {
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // 하단 *
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}